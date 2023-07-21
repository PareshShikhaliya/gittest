package class23;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\class23\\output.bin";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] data = {72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33}; // Sample binary data

            System.out.println("Writing to file using BufferedOutputStream:");
            bufferedOutputStream.write(data);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();

            System.out.println("File writing complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
