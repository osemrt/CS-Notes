package flyweight;

public class Terrorist implements Player {
    // Intrinsic Attribute
    private final String task;

    // Extrinsic Attribute
    private WeaponType weaponType;

    public Terrorist() {
        this.task = "plant a bomb";
    }

    @Override
    public void assignWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon : " + weaponType.toString() + " | " + "Task is " + task);
    }
}
