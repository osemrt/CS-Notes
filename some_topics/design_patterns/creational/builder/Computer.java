package builder;

public class Computer {

    //required parameters
    private String CPU;
    private String RAM;
    private String HDD;

    //optional parameters
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
    }


    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class Builder{

        //required parameters
        private String CPU;
        private String RAM;
        private String HDD;

        //optional parameters
        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String CPU, String RAM, String HDD) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.HDD = HDD;
        }

        public Builder setGraphicCardEnabled(boolean graphicCardEnabled) {
            isGraphicCardEnabled = graphicCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }




}
