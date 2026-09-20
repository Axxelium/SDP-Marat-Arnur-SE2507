package factories;

import models.Armor;
import models.PlateArmor;
import models.Sword;
import models.Weapon;

public class WarriorEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
}
