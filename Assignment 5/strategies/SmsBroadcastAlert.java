package strategies;

public class SmsBroadcastAlert implements IMassAlert {

    @Override
    public void signalAttentionEveryone() {
        System.out.println("ATTENTION EVERYONE!!! (by SMS)");
    }
}
