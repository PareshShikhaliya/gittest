package Module1.class23;

import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class23\\destination.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            String content = "Hello, World! how are u?";
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
