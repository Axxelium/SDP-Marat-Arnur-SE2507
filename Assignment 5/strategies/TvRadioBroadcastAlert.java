package strategies;

public class TvRadioBroadcastAlert implements IMassAlert {

    @Override
    public void signalAttentionEveryone() {
        System.out.println("ATTENTION EVERYONE!!! (by TV and Radio)");
    }
}
