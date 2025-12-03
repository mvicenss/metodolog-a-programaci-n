/** Client: uses Container and Iterator. */
public class Main {

    public static void main(String[] args) {

    // Create Spotify player (only the actual playlist)
        Container<Song> spotify = new SpotifyPlaylist();

    // Create CD playerk
        Container<Song> cdPlayer = new CDCollection(3); // Has 3 tracks

        System.out.println("---- Playing from Spotify (which uses ArrayList) ----");
        // Get the "remote" from Spotify and play music
        Iterator<Song> spotifyRemote = spotify.createIterator(); //Create an iterator with said name by calling createIterator on the SpotifyPlaylist class (returns a SpotifyIterator)
        playMusic(spotifyRemote);


        System.out.println("\n---- Playing from CD (which uses Array) ----");
        // Get the "remote" from the CD player and play music
        Iterator<Song> cdRemote = cdPlayer.createIterator();
        playMusic(cdRemote);
    }

    /** Play all songs via the iterator. */
    public static void playMusic(Iterator<Song> remote) { //the remote is the iterator
        while (remote.hasNext()) { //if it still has elements
            Song song = remote.next(); //song = current song (while adding 1 to the index)
            System.out.println("Now Playing: " + song);
        }
    }
}