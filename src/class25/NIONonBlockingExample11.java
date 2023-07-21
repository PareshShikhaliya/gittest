package class25;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIONonBlockingExample11 {
    public static void main(String[] args) {
        Path filePath = Path.of("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\class25\\input.txt");

        try (AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(filePath, StandardOpenOption.WRITE,
                StandardOpenOption.CREATE)) {

            String message = "Hello, World!  how are u ";
            ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());

            fileChannel.write(buffer, 0, null, new CompletionHandler<Integer, Void>() {
                @Override
                public void completed(Integer result, Void attachment) {
                    System.out.println("Write operation completed. Result: " + result);
                }

                @Override
                public void failed(Throwable exc, Void attachment) {
                    System.out.println("Write operation failed. Exception: " + exc.getMessage());
                }
            });

            System.out.println("Continuing execution...");

            // Sleep to allow non-blocking write operation to complete (not ideal in practice)
            Thread.sleep(2000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
