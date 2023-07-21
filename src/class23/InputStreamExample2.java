package class23;

import java.io.*;

public class InputStreamExample2 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\class23\\source.txt";

        try {
            // Opening the input stream
            FileInputStream fileInputStream = new FileInputStream(fileName);

            // Reading one byte from the stream
            int byteData = fileInputStream.read();
            System.out.println("Read byte: " + byteData);

            // Reading an array of bytes from the stream
            byte[] buffer = new byte[10];
            int bytesRead = fileInputStream.read(buffer);
            System.out.println("Bytes read: " + bytesRead);
            System.out.println("Data read: " + new String(buffer, 0, bytesRead));

            // Reading all bytes from the stream
            byte[] allBytes = fileInputStream.readAllBytes();
            System.out.println("All bytes read: " + new String(allBytes));

            // Skipping n bytes in the stream
            long bytesSkipped = fileInputStream.skip(5);
            System.out.println("Bytes skipped: " + bytesSkipped);

            // Checking how many bytes are left in the stream
            int bytesAvailable = fileInputStream.available();
            System.out.println("Bytes available: " + bytesAvailable);

            // Closing the stream
            fileInputStream.close();
            System.out.println("Stream closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
