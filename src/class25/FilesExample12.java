package class25;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample12 {
    public static void main(String[] args) {
        // Create a directory
        Path directoryPath = Paths.get("C:/my_directory");
        try {
            Files.createDirectory(directoryPath);
            System.out.println("Directory created successfully.");
        } catch (IOException e) {
            System.out.println("Failed to create directory: " + e.getMessage());
        }

        // Create a file
        Path filePath = Paths.get("C:/my_directory/my_file.txt");
        try {
            Files.createFile(filePath);
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("Failed to create file: " + e.getMessage());
        }

        // Check if a file or directory exists
        Path pathToCheck = Paths.get("C:/my_directory");
        boolean exists = Files.exists(pathToCheck);
        System.out.println("Does the path exist? " + exists);

        // Copy a file
        Path sourcePath = Paths.get("C:/my_directory/my_file.txt");
        Path destinationPath = Paths.get("C:/my_directory/my_file_copy.txt");
        try {
            Files.copy(sourcePath, destinationPath);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Failed to copy file: " + e.getMessage());
        }

        // Delete a file
        Path fileToDelete = Paths.get("C:/my_directory/my_file.txt");
        try {
            Files.delete(fileToDelete);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("Failed to delete file: " + e.getMessage());
        }

    }
}

