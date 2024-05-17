

public class PowerAdapter extends PowerSocket {

    private EDevice eDevice;
    private int adaptedVoltage;

    public PowerAdapter(int id, EDevice eDevice) {
        super(id);
        this.eDevice = eDevice;
        this.adaptedVoltage = eDevice.getVoltage();
    }

    @Override
    public boolean connectTo(EDevice eDev) {
        // Check if the device voltage matches the adapted voltage
        return adaptedVoltage == eDev.getVoltage();
    }

    @Override
    public void supply(EDevice eDev) {
        if (connectTo(eDev)) {
            eDev.receive(this);
        } else {
            System.out.println("cannot connect " + eDev.getDescription());
        }
    }

    @Override
    public int getVoltage() {
        // Return the adapted voltage
        return adaptedVoltage;
    }
}
