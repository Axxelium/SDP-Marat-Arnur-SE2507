package models;

public class LeatherArmor implements Armor {
    private static final int DEFENSE_RATING = 25;

    @Override
    public void defend() {
        System.out.println("Light leather armor provides high mobility to dodge!");
    }

    @Override
    public int getDefenseRating() {
        return DEFENSE_RATING;
    }
}
