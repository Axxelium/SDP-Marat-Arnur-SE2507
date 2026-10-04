package Weapons;
import Ammo.Ammo;

abstract class Weapon {
    protected Ammo ammo;

    public Weapon(Ammo ammo) {
        this.ammo = ammo;
    }

    public abstract void pullTrigger();

}
