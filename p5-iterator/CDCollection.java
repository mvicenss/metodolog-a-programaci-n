/** CDCollection: stores songs in an array. */
public class CDCollection implements Container<Song> {

    private Song[] songs;
    private int songCount = 0;

    public CDCollection(int capacity) {
        this.songs = new Song[capacity];
        // seed
        addSong("Smells Like Teen Spirit", "Nirvana");
        addSong("Wonderwall", "Oasis");
    }

    public void addSong(String title, String artist) {
        if (songCount < songs.length) {
            songs[songCount] = new Song(title, artist);
            songCount++;
        }
    }

    @Override
    public Iterator<Song> createIterator() {
        return new CDIterator(this.songs);
    }
}