package Weapons;
import Ammo.Ammo;

public abstract class Weapon {
    protected Ammo ammo;

    public Weapon(Ammo ammo) {
        this.ammo = ammo;
    }

    public abstract void pullTrigger();

    public void changeAmmo(Ammo newAmmo) {
        this.ammo = newAmmo;
        System.out.println("Ammo is updated");
    }

}
