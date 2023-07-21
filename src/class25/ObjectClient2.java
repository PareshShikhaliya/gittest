package class25;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ObjectClient2{
    public static void main(String[] args) {
        try {
            // Create a socket to connect to the server
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connected to server.");

            // Create an ObjectOutputStream to write the object to the server
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

            // Create an object to send
            Person person = new Person("John Doe", 30);

            // Write the object to the ObjectOutputStream
            objectOutputStream.writeObject(person);

            // Close the stream and socket
            objectOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
