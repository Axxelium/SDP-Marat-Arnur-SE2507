package Weapons;
import Ammo.Ammo;

public class AK extends Weapon {
    public AK(Ammo ammo) {
        super(ammo);
    }

    @Override
    public void pullTrigger() {
        ammo.fire("AK");
    }
}