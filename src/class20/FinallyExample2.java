package class20;


import java.io.FileReader;
import java.io.IOException;

public class FinallyExample2 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("FinallyExample2.java");
            
            char[] buffer = new char[1024];
            int numCharsRead = 0;
            while ((numCharsRead = reader.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, numCharsRead));
            }
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Caught IOException while closing file: " + e.getMessage());
            }
        }
    }
}
