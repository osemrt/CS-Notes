package adapter;

public class AdapterPatternTest {

    public static void main(String[] args) {


        Chargeable appleCharger = new AppleCharger();
        appleCharger.setMobileName("iPhone X");
        ChargerUtils.doCharge(appleCharger);

        Charger charger = new SamsungCharger();
        charger.setMobileName("Samsung Galaxy 9");
        // ChargerUtils.doCharge(charger); -> it will not work!

        AppleAdapter appleAdapter = new AppleAdapter();
        appleAdapter.setSamsungCharger(charger);
        ChargerUtils.doCharge(appleAdapter);

    }


}
