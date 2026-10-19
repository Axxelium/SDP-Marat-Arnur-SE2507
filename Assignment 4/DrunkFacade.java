import interfaces.IDrunk;
import models.Injector;
import models.Jarvis;
import models.Shaker;

public class DrunkFacade {
    IDrunk jarvis = new Jarvis();
    IDrunk shaker = new Shaker();
    IDrunk injector = new Injector();
    int counter;

    public void jarvisMoreAlcohol() {
        if (counter <= 3) {
            System.out.println("------------------------------");
            System.out.println("Understand");
            jarvis.doCocktail();
            shaker.doCocktail();
            injector.doCocktail();
            System.out.println("Cocktail injected directly into blood");

            counter++;
        } else {
            System.out.println("You have reached the limit\n " +
                    "this procedures will cause serious harm to your health");
        }
    }


}
