package Module1.class23;

import java.io.*;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class23\\binary.bin";

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            int bufferSize = 1024; // Set the buffer size (can be adjusted as needed)
            byte[] buffer = new byte[bufferSize];
            int bytesRead;

            System.out.println("Reading file using BufferedInputStream:");
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                // Process the read data
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print(buffer[i] + " ");
                }
            }

            bufferedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
