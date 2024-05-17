public class PowerSocket {
    private int id;
    protected int voltage = 220;

    public PowerSocket(int id) {
        this.id = id;
    }

    public boolean connectTo(EDevice eDev) {
        return eDev.getVoltage()==voltage;
    }

    public void supply(EDevice eDev) {
        if (connectTo(eDev)) {
            eDev.receive(this);
        }
        else {
            System.out.println("cannot connect "+eDev.getDescription());
        }
    }

    public int getId() {
        return id;
    }

    public int getVoltage() {
        return voltage;
    }

}
