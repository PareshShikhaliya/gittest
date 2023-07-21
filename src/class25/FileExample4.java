package class25;

import java.io.File;
import java.io.IOException;

public class FileExample4 {
    public static void main(String[] args) {
        // Create a File object representing a file or directory
        File file = new File("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\class25\\input.txt");

        // Check if the file exists
        boolean fileExists = file.exists();
        System.out.println("File exists: " + fileExists);

        // Get the file's name
        String fileName = file.getName();
        System.out.println("File name: " + fileName);

        // Get the file's absolute path
        String absolutePath = file.getAbsolutePath();
        System.out.println("Absolute path: " + absolutePath);

        // Get the file's parent directory
        String parentDirectory = file.getParent();
        System.out.println("Parent directory: " + parentDirectory);

        // Check if the file is a directory
        boolean isDirectory = file.isDirectory();
        System.out.println("Is directory: " + isDirectory);

        // Check if the file is a file (not a directory)
        boolean isFile = file.isFile();
        System.out.println("Is file: " + isFile);

        // Get the file's size in bytes
        long fileSize = file.length();
        System.out.println("File size (in bytes): " + fileSize);

        // Create a new directory
        File newDirectory = new File("new_directory");
        boolean directoryCreated = newDirectory.mkdir();
        System.out.println("Directory created: " + directoryCreated);

        // Create a new file
        File newFile = new File("new_directory/new_file.txt");
        try {
            boolean fileCreated = newFile.createNewFile();
            System.out.println("File created: " + fileCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Delete a file
//        boolean fileDeleted = newFile.delete();
//        System.out.println("File deleted: " + fileDeleted);
//
//        // Delete a directory
//        boolean directoryDeleted = newDirectory.delete();
//        System.out.println("Directory deleted: " + directoryDeleted);
    }
}
