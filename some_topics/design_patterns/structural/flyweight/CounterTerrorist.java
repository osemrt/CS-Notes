package flyweight;

public class CounterTerrorist implements Player {
    //Extrinsic Attribute
    private final String task;
    //Intrinsic Attribute
    private WeaponType weaponType;

    public CounterTerrorist() {
        this.task = "diffuse the bomb";
    }

    @Override
    public void assignWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public void mission() {
        System.out.println("Counter-Terrorist with weapon : " + weaponType.toString() + " | " + "Task is " + task);
    }
}
