package factories;

import models.Armor;
import models.Bow;
import models.LeatherArmor;
import models.Weapon;

public class ArcherEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
