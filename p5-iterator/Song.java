/** Song: data holder. -- AUX CLASS*/
public class Song {
    //Att. of a song
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }

    @Override
    public String toString() { return title + " by " + artist; }
}