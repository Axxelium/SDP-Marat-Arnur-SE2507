package Ammo;

public class Ammo556 implements Ammo {

    @Override
    public void fire(String weaponName) {
        System.out.println(weaponName + "shoots with 5.56 mm");
    };
}
