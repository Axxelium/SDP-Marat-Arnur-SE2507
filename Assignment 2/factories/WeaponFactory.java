package factories;

import models.Weapon;

public abstract class WeaponFactory {
    public abstract Weapon createWeapon();

    public void prepareAndInspectWeapon() {
        Weapon weapon = createWeapon();
        weapon.displayDurability();
        weapon.attack();
    }
}
