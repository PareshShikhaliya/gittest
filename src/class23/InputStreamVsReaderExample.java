package class23;

import java.io.*;

public class InputStreamVsReaderExample {
    public static void main(String[] args) {
        //String filePath = "C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\class23\\source.txt";
        String filePath = "C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\class23\\mesi.jpg";
        try {
            // Using FileInputStream
            FileInputStream read1 = new FileInputStream(filePath);
            System.out.println("Reading file using FileInputStream:");
            int data;
            while ((data = read1.read()) != -1) {
                System.out.print((char)data);
            }
            read1.close();

            System.out.println("\n");

            // Using FileReader
            FileReader read2 = new FileReader(filePath);
            System.out.println("Reading file using FileReader:");
            while ((data = read2.read()) != -1) {
                System.out.print((char)data);
            }
            read2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
