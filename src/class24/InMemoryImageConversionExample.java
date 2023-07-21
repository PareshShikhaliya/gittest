package class24;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class InMemoryImageConversionExample {

    public static void main(String[] args) {
        try {
            // Load the image from a file or any other source
            BufferedImage originalImage = ImageIO.read(new File("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\class24\\mesi.jpg"));

            // Convert the image to a byte array in PNG format
            byte[] pngBytes = convertImageToPNGBytes(originalImage);

            // Process the in-memory PNG image
            processInMemoryPNGImage(pngBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] convertImageToPNGBytes(BufferedImage image) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "png", outputStream);
        return outputStream.toByteArray();
    }

    public static void processInMemoryPNGImage(byte[] pngBytes) throws IOException {
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(pngBytes)) {
            // Read the PNG image from the input stream
            BufferedImage image = ImageIO.read(inputStream);

            // Process the PNG image in memory
            // Perform any desired operations on the image

            // Save the processed image to a file or any other destination
            ImageIO.write(image, "png", new File("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\class24\\mesi.png"));
        }
    }
}
