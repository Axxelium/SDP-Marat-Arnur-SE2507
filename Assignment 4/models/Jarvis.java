package models;

import interfaces.IDrunk;

public class Jarvis implements IDrunk {

    @Override
    public void doCocktail() {
        System.out.println("2. Choosing a cocktail");
    }
}
