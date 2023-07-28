package Module1.class25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOBlockingExample10 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\pares\\Downloads\\GMT20230628-131529_Recording.m4a");
             FileOutputStream outputStream = new FileOutputStream("C:\\Users\\pares\\Downloads\\io.m4a")) {


            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                // Delay to simulate time-consuming operation
                sleep(100);

                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied using Java IO (blocking) successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
