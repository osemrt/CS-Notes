package builder;

public class BuilderPatternTest {

    public static void main(String[] args) {

        //first method
        Computer computer1 = new Computer.Builder("Intel i7", "4 GB", "2 TB").build();
        Computer computer2 = new Computer.Builder("Intel i7", "4 GB", "2 TB").setBluetoothEnabled(true).build();
        Computer computer3 = new Computer.Builder("Intel i7", "4 GB", "2 TB").setBluetoothEnabled(true).setGraphicCardEnabled(true).build();

        //second method
        ComputerBuilderDirectory computerBuilderDirectory = new ComputerBuilderDirectory();

        Computer computer4 = computerBuilderDirectory.getBasicComputer();
        Computer computer5 = computerBuilderDirectory.getBluetoothEnabledComputer();
        Computer computer6 = computerBuilderDirectory.getAdvancedComputer();



    }


}
