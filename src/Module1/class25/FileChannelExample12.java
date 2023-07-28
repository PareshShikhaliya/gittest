package Module1.class25;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileChannelExample12 {
    public static void main(String[] args) {
        // Path to the file
        Path filePath = Path.of("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class25\\input.txt");

        try (FileChannel fileChannel = FileChannel.open(filePath, StandardOpenOption.READ, StandardOpenOption.WRITE)) {

            // Writing data to the file
            String message = "Hello, World! how are u ? am fine !";
            ByteBuffer writeBuffer = ByteBuffer.wrap(message.getBytes());

            // Write the contents of the buffer to the file
            int bytesWritten = fileChannel.write(writeBuffer);
            System.out.println("Bytes written: " + bytesWritten);

            // Positioning the file pointer to the beginning
            fileChannel.position(0);

            // Reading data from the file
            ByteBuffer readBuffer = ByteBuffer.allocate(1024);

            // Read data from the file into the buffer
            int bytesRead = fileChannel.read(readBuffer);
            readBuffer.flip();

            // Converting the read data to a string
            byte[] data = new byte[bytesRead];
            readBuffer.get(data);
            String readMessage = new String(data);
            System.out.println("Read message: " + readMessage);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

