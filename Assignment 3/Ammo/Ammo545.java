package Ammo;

import java.sql.SQLOutput;

public class Ammo545 implements Ammo {

    @Override
    public void fire(String weaponName) {
        System.out.println(weaponName + "shoots with 5.45 mm");
    };
}
