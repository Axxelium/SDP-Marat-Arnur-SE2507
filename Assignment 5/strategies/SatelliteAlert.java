package strategies;

public class SatelliteAlert implements IMassAlert {

    @Override
    public void signalAttentionEveryone() {
        System.out.println("ATTENTION EVERYONE!!! (by satellite communication)");
    }
}
