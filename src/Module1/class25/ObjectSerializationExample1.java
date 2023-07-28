package Module1.class25;

import java.io.*;



public class ObjectSerializationExample1 {
    public static void main(String[] args) {
        // Create an object to serialize
        Person person = new Person("John Doe", 30);

        try {
            // Create an ObjectOutputStream to write objects to a file
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // Write the object to the ObjectOutputStream
            objectOut.writeObject(person);

            // Close the streams
            objectOut.close();
            fileOut.close();

            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Create an ObjectInputStream to read objects from a file
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            // Read the object from the ObjectInputStream
            Person deserializedPerson = (Person) objectIn.readObject();

            // Close the streams
            objectIn.close();
            fileIn.close();

            // Print the deserialized object
            System.out.println("Deserialized object: " + deserializedPerson.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

