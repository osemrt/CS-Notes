package adapter;

public class SamsungCharger implements Charger {

    String mobileName;

    @Override
    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;

    }

    @Override
    public void supplyCharge() {
        System.out.println("Charging " + this.mobileName + " ...");
    }
}
