package models;

public class PlateArmor implements Armor {
    private static final int DEFENSE_RATING = 50;

    @Override
    public void defend() {
        System.out.println("Plate armor deflects the incoming heavy blow!");
    }

    @Override
    public int getDefenseRating() {
        return DEFENSE_RATING;
    }
}
