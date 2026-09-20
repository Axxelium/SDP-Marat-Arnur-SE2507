package factories;

import models.Sword;
import models.Weapon;

public class SwordFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
