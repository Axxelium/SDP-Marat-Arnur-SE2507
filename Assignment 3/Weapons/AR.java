package Weapons;
import Ammo.Ammo;

public class AR extends Weapon {
    public AR(Ammo ammo) {
        super(ammo);
    }

    @Override
    public void pullTrigger() {
        ammo.fire("AR-15");
    }
}