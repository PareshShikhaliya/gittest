package Module1.class23;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class23\\source.txt";

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            System.out.println("Data read from the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
