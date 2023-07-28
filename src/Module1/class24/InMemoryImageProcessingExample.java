package Module1.class24;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class InMemoryImageProcessingExample {

    public static void main(String[] args) {
        try {
            // Load the image from a file or any other source
            BufferedImage originalImage = ImageIO.read(new File("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class24\\mesi.jpg"));

            // Convert the image to a byte array
            byte[] imageBytes = convertImageToBytes(originalImage);

            // Process the in-memory image
            processInMemoryImage(imageBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] convertImageToBytes(BufferedImage image) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", outputStream);
        return outputStream.toByteArray();
    }

    public static void processInMemoryImage(byte[] imageBytes) throws IOException {
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(imageBytes)) {
            // Read the image from the input stream
            BufferedImage image = ImageIO.read(inputStream);

            // Process the image in memory
            BufferedImage processedImage = convertToBlackAndWhite(image);

            // Save the processed image to a file or any other destination
            ImageIO.write(processedImage, "jpg", new File("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class24\\mesi1.jpg"));
        }
    }

    public static BufferedImage convertToBlackAndWhite(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage blackAndWhiteImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color color = new Color(image.getRGB(x, y));
                int grayscale = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                Color blackAndWhite = new Color(grayscale, grayscale, grayscale);
                blackAndWhiteImage.setRGB(x, y, blackAndWhite.getRGB());
            }
        }

        return blackAndWhiteImage;
    }
}
