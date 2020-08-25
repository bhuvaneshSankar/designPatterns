import java.util.ArrayList;

public class Playlist implements IComponent {
    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList<>();
    float speed;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    public void play() {
        this.playlist.stream().forEach(individualPlayList -> individualPlayList.play());
    }

    public void setPlayBackSpeed(float speed) {
        this.playlist.stream().forEach(individualPlayList -> individualPlayList.setPlayBackSpeed(speed));
    }

    public String getName() {
        return this.playlistName;
    }
}