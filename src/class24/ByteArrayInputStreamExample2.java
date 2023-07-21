package class24;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample2 {

    public static void main(String[] args) {
        byte[] byteArray = { 10, 20, 30, 40, 50 };

        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray)) {
            // Read and print each byte using read() method
            System.out.println("Reading bytes:");
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                System.out.println(byteRead);
            }

            // Check the number of remaining bytes using available() method
            System.out.println("Remaining bytes: " + inputStream.available());

            // Reset the stream to the beginning using reset() method
            inputStream.reset();
            System.out.println("available bytes: " + inputStream.available());
            // Skip the first two bytes using skip() method
            long skippedBytes = inputStream.skip(2);
            System.out.println("Skipped bytes: " + skippedBytes);

            // Read and print the remaining bytes after skipping
            System.out.println("Reading remaining bytes after skipping:");
            while ((byteRead = inputStream.read()) != -1) {
                System.out.println(byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
