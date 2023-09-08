package module2.class15;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer3 {

    private List<Song> playlist;
    private int currentTrackIndex;

    public MusicPlayer3() {
        playlist = new ArrayList<>();
        currentTrackIndex = -1;
    }

    public void addSong(String title, String artist, int durationInSeconds) {
        Song song = new Song(title, artist, durationInSeconds);
        playlist.add(song);
    }

    public void play() {
        if (playlist.isEmpty()) {
            System.out.println("No songs in the playlist.");
            return;
        }

        if (currentTrackIndex == -1) {
            currentTrackIndex = 0;
        }

        Song currentSong = playlist.get(currentTrackIndex);
        System.out.println("Playing: " + currentSong.getTitle() + " by " + currentSong.getArtist());

        // Inner class for controlling playback
        class PlayerControl {
            public void pause() {
                System.out.println("Pausing playback.");
            }

            public void next() {
                if (currentTrackIndex < playlist.size() - 1) {
                    currentTrackIndex++;
                    play();
                } else {
                    System.out.println("End of playlist.");
                }
            }
        }

        PlayerControl playerControl = new PlayerControl();
        playerControl.pause();
        playerControl.next();
    }

    // Inner class representing a song
    private class Song {
        private String title;
        private String artist;
        private int durationInSeconds;

        public Song(String title, String artist, int durationInSeconds) {
            this.title = title;
            this.artist = artist;
            this.durationInSeconds = durationInSeconds;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }
    }

    public static void main(String[] args) {
        MusicPlayer3 player = new MusicPlayer3();
        player.addSong("Song 1", "Artist 1", 240);
        player.addSong("Song 2", "Artist 2", 180);
        player.play();
    }
}
