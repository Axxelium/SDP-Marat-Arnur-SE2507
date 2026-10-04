package Ammo;

public class Ammo762 implements Ammo {

    @Override
    public void fire(String weaponName) {
        System.out.println(weaponName + "shoots with 7.62 mm");
    };
}
