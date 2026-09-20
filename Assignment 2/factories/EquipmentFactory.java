package factories;

import models.Armor;
import models.Weapon;

public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
}
