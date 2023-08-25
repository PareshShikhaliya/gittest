package module2.class11;

class MusicPlayer implements Runnable {
    public void run() {
        System.out.println("Background music playing...");
        try {
            while (!Thread.currentThread().isInterrupted()) {
                // Simulate playing music
                Thread.sleep(1000); // Simulate passage of time
            }
        } catch (InterruptedException e) {
            System.out.println("Music player interrupted.");
        }
    }
}

public class MusicPlayerExample6 {
    public static void main(String[] args) {
        // Create a thread for the music player
        Thread musicThread = new Thread(new MusicPlayer());

        // Start playing background music
        musicThread.start();

        // Simulate user stopping the music after 5 seconds
        try {
            Thread.sleep(5000); // Wait for 5 seconds
            musicThread.interrupt(); // Interrupt the music player thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
