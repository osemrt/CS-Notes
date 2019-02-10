package flyweight;

import java.util.Random;

public class FlyWeightPatternTest {


    public static void main(String[] args) {

        for(int i = 0; i<10; i++){

            Player player = PlayerFactory.getPlayer(getRandomPlayerType());
            player.assignWeapon(getRandomWeaponType());
            player.mission();
        }

    }

    private static WeaponType getRandomWeaponType() {
        WeaponType[] weaponTypes = WeaponType.values();
        return weaponTypes[getRandomNumber(weaponTypes.length)];
    }

    private static PlayerType getRandomPlayerType() {
        PlayerType[] playerTypes = PlayerType.values();
        return playerTypes[getRandomNumber(playerTypes.length)];
    }

    private static int getRandomNumber(int length) {
        Random random = new Random();
        return random.nextInt(length);
    }


}
