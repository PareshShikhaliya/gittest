package Module1.seven;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageProcessingExample {
    public static void main(String[] args) throws IOException {
        // Load the image from a file
        File file = new File("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.seven\\mesi.jpg");
        BufferedImage image = ImageIO.read(file);

        // Get the dimensions of the image
        int width = image.getWidth();
        int height = image.getHeight();

        // Create a 2D array to hold the pixel values of the image
        int[][] pixels = new int[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // Get the color of the pixel at (x, y)
                Color color = new Color(image.getRGB(x, y));

                // Convert the color to grayscale
                int gray = (int) (color.getRed() * 0.299 + color.getGreen() * 0.587 + color.getBlue() * 0.114);

                // Store the grayscale value in the 2D array
                pixels[x][y] = gray;
            }
        }

        // Process the pixels in the 2D array as desired

        // Create a new image from the processed pixel values
        BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // Set the color of the pixel at (x, y) in the new image
                int value = pixels[x][y];
                Color color = new Color(value, value, value);
                newImage.setRGB(x, y, color.getRGB());
            }
        }

        // Save the new image to a file
        File outputFile = new File("processed.png");
        ImageIO.write(newImage, "png", outputFile);
    }
}
