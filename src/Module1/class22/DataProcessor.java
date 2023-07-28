package Module1.class22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class DataProcessor {
    public static void main(String[] args) {

        try {
            processDataFile("data.txt");
        } catch (Exception e) {
            // Wrapping the checked exception inside a custom unchecked exception
            throw new DataProcessingException("Error processing data.", e);
        }
    }

    public static void processDataFile(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            // Code to process the data from the file
            // ...

            scanner.close();
        } catch (FileNotFoundException e) {
            // Wrapping the checked exception inside a custom unchecked exception
            throw new DataProcessingException("Data file not found.", e);
        }
    }
}

