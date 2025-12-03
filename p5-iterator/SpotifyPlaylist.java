import java.util.ArrayList;
import java.util.List;

/** SpotifyPlaylist: list-backed container. */
public class SpotifyPlaylist implements Container<Song> {

    private List<Song> playlist; //List containing all songs (the actual playlist)

    public SpotifyPlaylist() { //Contents of the playlist
        this.playlist = new ArrayList<>(); //The list above is an ArrayList
        addSong("Bohemian Rhapsody", "Queen");
        addSong("Stairway to Heaven", "Led Zeppelin");
        addSong("Hotel California", "Eagles");
    }

    public void addSong(String title, String artist) {
        this.playlist.add(new Song(title, artist));
    }

    @Override //METHOD MAIN WILL USE
    public Iterator<Song> createIterator() {
        return new SpotifyIterator(this.playlist); //when called, it will return an iterator, and the List in SpotifyIterator will have the values of the playlist list above
    }
}