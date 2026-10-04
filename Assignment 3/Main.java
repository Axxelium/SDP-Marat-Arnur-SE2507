import Ammo.*;
import Weapons.*;

public class Main {
    public static void main(String[] args) {
        Weapon myAk = new AK(new Ammo545());
        myAk.pullTrigger();

        myAk.changeAmmo(new Ammo762());
        myAk.pullTrigger();

        Weapon myAr = new AR(new Ammo556());
        myAr.pullTrigger();

        myAr.changeAmmo(new Ammo762());
        myAr.pullTrigger();
    }
}