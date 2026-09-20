public class SwordFactory implements ICombatFactory {

    @Override
    public void createCombatWeapon() {
        return new Sword();
    }
}
