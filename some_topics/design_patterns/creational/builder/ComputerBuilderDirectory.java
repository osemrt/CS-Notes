package builder;

public class ComputerBuilderDirectory {

    public Computer getBasicComputer(){
        return new Computer.Builder("Intel i7", "4 GB", "2 TB").build();
    }

    public Computer getBluetoothEnabledComputer(){
        return new Computer.Builder("Intel i7", "4 GB", "2 TB").setBluetoothEnabled(true).build();
    }

    public Computer getAdvancedComputer(){
        return new Computer.Builder("Intel i7", "4 GB", "2 TB").setBluetoothEnabled(true).setGraphicCardEnabled(true).build();
    }


}
