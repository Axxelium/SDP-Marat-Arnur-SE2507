public class Sword extends Weapon implements ICombats {

    @Override
    public void attack() {
        System.out.println("You swings sword!")
    }

    @Override
    public void block() {
      System.out.println("You blocks enemy hit!");
    }

    @Override
    public void tellDurablity() {
        System.out.println("Your sword shines!");
    }

    void sharppenSword() {
        System.out.println("You sharppen your sword");
    }
}
