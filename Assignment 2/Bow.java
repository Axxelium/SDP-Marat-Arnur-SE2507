public class Bow extends Weapon implements ICombat {

    @Override
    public void Attack() {
        System.out.println("You shots by bow")
    }

    @Override
    public void Block() {
        System.out.println("You cannot block attacks!");
    }

    @Override
    public void tellDurability() {
        System.out.println("Your bow looks old");
    }

    void strenchBowstring() {
        System.out.println("You strench bowstring");
    }
}
