package class24;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {

    public static void main(String[] args) {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            // Write a byte to the output stream using write() method
            outputStream.write(10);

            // Write an array of bytes to the output stream using write(byte[] b, int off, int len) method
            byte[] byteArray = { 20, 30, 40, 50 };
            outputStream.write(byteArray, 0, byteArray.length);

            // Retrieve the contents of the output stream as a byte array using toByteArray() method
            byte[] result = outputStream.toByteArray();

            // Print the values in the byte array
            for (byte b : result) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
