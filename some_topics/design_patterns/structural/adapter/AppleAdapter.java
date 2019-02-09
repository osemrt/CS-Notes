package adapter;

public class AppleAdapter implements Chargeable {

    Charger samsungCharger = new SamsungCharger();

    public void setSamsungCharger(Charger samsungCharger) {
        this.samsungCharger = samsungCharger;
    }


    @Override
    public void setMobileName(String mobileName) {
        // keep it empty
    }

    @Override
    public void charge() {
        samsungCharger.supplyCharge();
    }



}
