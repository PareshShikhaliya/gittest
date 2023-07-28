package Module1.class25;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileAttributeExample8 {
    public static void main(String[] args) {
        Path filePath = Path.of("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class25\\input.txt");

        try {
            // Retrieve basic file attributes
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("File Name: " + filePath.getFileName());
            System.out.println("File Size: " + attributes.size() + " bytes");
            System.out.println("File Creation Time: " + formatDateTime(attributes.creationTime()));
            System.out.println("File Last Modified Time: " + formatDateTime(attributes.lastModifiedTime()));
            System.out.println("File Last Accessed Time: " + formatDateTime(attributes.lastAccessTime()));

            // Update file last modified time
            FileTime newLastModifiedTime = FileTime.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
            Files.getFileAttributeView(filePath, BasicFileAttributeView.class)
                    .setTimes(newLastModifiedTime, attributes.lastAccessTime(), attributes.creationTime());
            System.out.println("New Last Modified Time: " + formatDateTime(newLastModifiedTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String formatDateTime(FileTime fileTime) {
        return fileTime.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime()
                .toString();
    }
}
