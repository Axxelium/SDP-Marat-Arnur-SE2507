package strategies;

public class CellBroadcastAlert implements IMassAlert {

    @Override
    public void signalAttentionEveryone() {
        System.out.println("ATTENTION EVERYONE!!! (by cell service)");
    }
}
