import factories.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. FACTORY METHOD DEMONSTRATION");
        WeaponFactory swordMaker = new SwordFactory();
        swordMaker.prepareAndInspectWeapon();

        System.out.println("\n---------");
        WeaponFactory bowMaker = new BowFactory();
        bowMaker.prepareAndInspectWeapon();

        System.out.println("\n2. ABSTRACT FACTORY DEMONSTRATION");
        System.out.println("Deploying Warrior Loadout:");
        EquipmentFactory warriorKit = new WarriorEquipmentFactory();
        HeroEquipmentManager warrior = new HeroEquipmentManager(warriorKit);
        warrior.enterCombat();

        System.out.println("\nDeploying Archer Loadout:");
        EquipmentFactory archerKit = new ArcherEquipmentFactory();
        HeroEquipmentManager archer = new HeroEquipmentManager(archerKit);
        archer.enterCombat();
    }
}
