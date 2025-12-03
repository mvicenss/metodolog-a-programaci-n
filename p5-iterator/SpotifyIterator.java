import java.util.List;

/** SpotifyIterator: list-backed iterator. */
public class SpotifyIterator implements Iterator<Song> {
    private List<Song> songs; //Stores songs in a playlist
    private int index = 0; //song position

    public SpotifyIterator(List<Song> songs) {
        this.songs = songs;
    } //assings to songs the contents of a SpotifyPlaylist list

    @Override
    public boolean hasNext() {
        return index < songs.size(); //return true if the index is smaller than the size of the Songs list (there are songs left)
    }

    @Override
    public Song next() {
        return songs.get(index++); //return next song
    }
}
