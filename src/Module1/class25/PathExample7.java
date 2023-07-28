package Module1.class25;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample7 {
    public static void main(String[] args) {
        // Absolute path example
        Path absolutePath = Paths.get("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class25\\input.txt");
        Path absoluteNormalizedPath = absolutePath.normalize();

        System.out.println("Absolute Path: " + absoluteNormalizedPath);
        System.out.println("Relative Path: " + getRelativePath(absoluteNormalizedPath));

        System.out.println();

    }

    private static Path getRelativePath(Path path) {
        Path basePath = Paths.get("").toAbsolutePath().normalize();
        return basePath.relativize(path);
    }

    private static Path getAbsolutePath(Path path) {
        return path.toAbsolutePath().normalize();
    }
}
