package Module1.class23;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class23\\destination.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String content = "Hello, World!";
            bufferedWriter.write(content);
            bufferedWriter.newLine(); // Writing a new line
            bufferedWriter.write("This is a new line.");

            bufferedWriter.close();
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
