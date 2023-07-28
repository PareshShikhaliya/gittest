package Module1.class21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithoutTryWithResourcesExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class21\\input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the file: " + e.getMessage());
                }
            }
        }
    }
}
