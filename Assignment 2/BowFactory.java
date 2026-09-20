public class BowFactory implements ICombatFactory {

    @Override
    public ICombat createCombatWeapon() {
        return new Bow();
    }
}
