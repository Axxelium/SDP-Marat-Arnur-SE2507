package models;

public class Bow implements Weapon {
    @Override
    public void attack() {
        System.out.println("You shoot an arrow with the bow!");
    }

    @Override
    public void block() {
        System.out.println("You cannot block attacks with a bow!");
    }

    @Override
    public void displayDurability() {
        System.out.println("Your bow looks old.");
    }

    public void stretchBowstring() {
        System.out.println("You stretch the bowstring.");
    }
}
