public class Song implements IComponent {
    String songName;
    String artist;
    float speed = 1;

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing the song " + songName);
    }

    public void setPlayBackSpeed(float speed) {
        this.speed = speed;
        System.out.println("Playback speed set to " + speed + "x");
    }

    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return this.artist;
    }
}