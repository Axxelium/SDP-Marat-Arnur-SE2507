import Ammo.*;
import Weapons.*;

public class Main {
    public static void main(String[] args) {
        Weapon myAk = new AK(new Ammo545());
        myAk.pullTrigger();
        System.out.println("-------------");
        myAk.changeAmmo(new Ammo762());
        myAk.pullTrigger();

        System.out.println("-------------");
        Weapon myAr = new AR(new Ammo556());
        myAr.pullTrigger();

        System.out.println("-------------");
        myAr.changeAmmo(new Ammo762());
        myAr.pullTrigger();
    }
}