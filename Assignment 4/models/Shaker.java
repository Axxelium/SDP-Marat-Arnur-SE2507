package models;

import interfaces.IDrunk;

public class Shaker implements IDrunk {

    @Override
    public void doCocktail() {
        System.out.println("1. Mixing ingredients");
    }
}
