package class25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class IOvsNIOExample9 {
    public static void main(String[] args) {


        // Java NIO example
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\pares\\Downloads\\GMT20230628-131529_Recording.m4a");
             FileOutputStream outputStream = new FileOutputStream("C:\\Users\\pares\\Downloads\\nio.m4a")) {

            FileChannel inputChannel = inputStream.getChannel();
            FileChannel outputChannel = outputStream.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead;

            while ((bytesRead = inputChannel.read(buffer)) != -1) {
                buffer.flip();
                outputChannel.write(buffer);
                buffer.clear();
            }

            System.out.println("File copied using Java NIO successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Java IO example
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\pares\\Downloads\\GMT20230628-131529_Recording.m4a");
             FileOutputStream outputStream = new FileOutputStream("C:\\Users\\pares\\Downloads\\io.m4a")) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied using Java IO successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
