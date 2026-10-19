import models.BioMonitor;
import models.Injector;
import models.Jarvis;
import models.Shaker;

public class DrinkFacade {
    private final BioMonitor bioMonitor = new BioMonitor();
    private final Jarvis jarvis = new Jarvis();
    private final Shaker shaker = new Shaker();
    private final Injector injector = new Injector();

    public void jarvisMoreAlcohol(String cocktail) {
        System.out.println("------------------------------");
        if (bioMonitor.isSafe()) {
            System.out.println("Understand");
            jarvis.chooseCocktail(cocktail);
            shaker.mixIngredients(cocktail);
            injector.injectAlcohol(cocktail);
            bioMonitor.addDose();
            System.out.println(cocktail + " injected directly into blood");
        } else {
            System.out.println("You have reached the limit\n" +
                    "this procedure will cause serious harm to your health");
        }
    }
}