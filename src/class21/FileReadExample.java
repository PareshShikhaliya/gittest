package class21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Open the file
            reader = new BufferedReader(new FileReader("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\class21\\input.txt"));

            // Read a line from the file
            String line = reader.readLine();
            System.out.println("First line of the file: " + line);
        } catch (IOException e) {
            // Handle the exception
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            // Close the file in the finally block to ensure it gets closed even if an exception occurs
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                // Handle the exception
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}
