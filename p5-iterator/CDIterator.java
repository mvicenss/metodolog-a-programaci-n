/** CDIterator: array-backed iterator. */
public class CDIterator implements Iterator<Song> {

    private Song[] songs;
    private int index = 0;

    public CDIterator(Song[] songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return index < songs.length && songs[index] != null;
    }

    @Override
    public Song next() {
        Song song = songs[index];
        index++;
        return song;
    }
}