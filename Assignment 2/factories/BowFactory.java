package factories;

import models.Bow;
import models.Weapon;

public class BowFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}
