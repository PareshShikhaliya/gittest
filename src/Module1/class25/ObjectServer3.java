package Module1.class25;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ObjectServer3 {
    public static void main(String[] args) {
        try {
            // Create a ServerSocket to listen for incoming connections
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server started. Waiting for client...");

            // Accept a client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create an ObjectInputStream to read the object from the client
            ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());

            // Read the object from the ObjectInputStream
            Object receivedObject = objectInputStream.readObject();

            // Close the streams and socket
            objectInputStream.close();
            clientSocket.close();
            serverSocket.close();

            // Process the received object
            if (receivedObject instanceof Person) {
                Person person = (Person) receivedObject;
                System.out.println("Received object: " + person.toString());
            } else {
                System.out.println("Received object is not of type MyObject.");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
