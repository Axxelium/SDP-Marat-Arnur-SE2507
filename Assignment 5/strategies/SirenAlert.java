package strategies;

public class SirenAlert implements IMassAlert {

    @Override
    public void signalAttentionEveryone() {
        System.out.println("ATTENTION EVERYONE!!! (by sirens)");
    }
}
