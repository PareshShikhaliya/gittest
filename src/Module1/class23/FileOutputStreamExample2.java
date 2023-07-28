package Module1.class23;

import java.io.*;

public class FileOutputStreamExample2 {
    public static void main(String[] args) {
        try {
            // OutputStream example
            OutputStream outputStream = new FileOutputStream("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\Module1.class23\\source.txt");

            // Writing a single byte to the stream
            int byteValue = 65; // ASCII value for 'A'
            outputStream.write(byteValue);

            // Writing a byte array to the stream
            byte[] byteArray = {66, 67, 68}; // ASCII values for 'B', 'C', 'D'
            outputStream.write(byteArray);

            // Writing part of a byte array to the stream
            byte[] partialByteArray = {69, 70, 71, 72}; // ASCII values for 'E', 'F', 'G', 'H'
            outputStream.write(partialByteArray, 1, 2);

            // Flushing the stream
            outputStream.flush();

            // Closing the stream
            outputStream.close();

            // Writer example
            Writer writer = new FileWriter("output.txt");

            // Writing a single character to the stream
            int charValue = 97; // Unicode value for 'a'
            writer.write(charValue);

            // Writing an array of characters to the stream
            char[] charArray = {'b', 'c', 'd'};
            writer.write(charArray);

            // Writing part of a character array to the stream
            char[] partialCharArray = {'e', 'f', 'g', 'h'};
            writer.write(partialCharArray, 1, 2);

            // Writing a string to the stream
            String str = "Hello, World!";
            writer.write(str);

            // Writing part of a string to the stream
            String partialString = "OpenAI GPT-3.5";
            writer.write(partialString, 6, 6);

            // Flushing the stream
            writer.flush();

            // Closing the stream
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

