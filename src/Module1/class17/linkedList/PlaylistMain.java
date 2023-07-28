package Module1.class17.linkedList;

import java.util.ArrayList;
import java.util.List;

class Song {
    String title;
    String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}


public class PlaylistMain {
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>();

        Song s1 = new Song("Kalank","Arijeet");
        Song s2 = new Song("waka waka","Sakira");
        playlist.add(s1);
        playlist.add(s2);

        for(Song s : playlist)
        {
            System.out.println(s.artist +"  "+s.title);
        }

    }
}
