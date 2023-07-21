package class25;

import java.io.File;

public class PathExample6 {
    public static void main(String[] args) {
        // Relative path example
        String relativePath = "C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\class25\\input.txt";
        File relativeFile = new File(relativePath);

        System.out.println("Relative Path: " + relativePath);
        System.out.println("Absolute Path: " + relativeFile.getAbsolutePath());


        System.out.println();

        // Absolute path example
        String absolutePath = "C:/myfolder/myfile.txt";
        File absoluteFile = new File(absolutePath);

        System.out.println("Relative Path: " + absoluteFile.getPath());
        System.out.println("Absolute Path: " + absolutePath);
    }
}

