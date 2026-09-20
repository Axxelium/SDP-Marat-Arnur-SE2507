package models;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("You swing the sword!");
    }

    @Override
    public void block() {
        System.out.println("You block enemy hit!");
    }

    @Override
    public void displayDurability() {
        System.out.println("Your sword shines!");
    }

    public void sharpenSword() {
        System.out.println("You sharpen your sword.");
    }
}
