package class23;

import java.io.*;

public class FileInputStreamExample {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\class23\\source.txt";

        try {
            FileInputStream fis = new FileInputStream(fileName);
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            fis.close();
            System.out.println("\nData read from the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
