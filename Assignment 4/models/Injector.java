package models;

import interfaces.IDrunk;

public class Injector implements IDrunk {

    @Override
    public void doCocktail() {
        System.out.println("3. Injecting alcohol");
    }
}
