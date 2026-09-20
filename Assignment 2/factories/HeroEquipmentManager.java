package factories;

import models.Armor;
import models.Weapon;

public class HeroEquipmentManager {
    private final Weapon weapon;
    private final Armor armor;

    public HeroEquipmentManager(EquipmentFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("EquipmentFactory cannot be null");
        }
        this.weapon = factory.createWeapon();
        this.armor = factory.createArmor();
    }

    public void enterCombat() {
        System.out.println("Hero prepares for battle:");
        armor.defend();
        weapon.attack();
        System.out.println("Armor defense rating: " + armor.getDefenseRating());
    }
}
