public class EDevice {
    private final int voltage;
    private final String description;

    public EDevice(String description,int voltage) {
        this.voltage = voltage;
        this.description=description;
    }

    public int getVoltage() {
        return voltage;
    }

    public String getDescription() {
        return description;
    }


    public void receive(PowerSocket pS) {
        System.out.println(description+" receives from power socket "+pS.getId() + " at "+pS.getVoltage()+" Volt");
    }

}
