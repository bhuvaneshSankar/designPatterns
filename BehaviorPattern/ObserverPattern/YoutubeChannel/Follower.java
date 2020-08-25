public class Follower implements Observer {
    private String followerName;

    public void play() {

    }

    public void update(String message) {
        System.out.println(message);
    }
}