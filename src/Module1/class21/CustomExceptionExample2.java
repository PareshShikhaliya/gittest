package Module1.class21;

import java.util.Scanner;

public class CustomExceptionExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the username: ");
        String username = scanner.nextLine();

        try {
            validateUsername(username);
            System.out.println("Username is valid. Proceeding with the program...");
        } catch (InvalidUsernameException e) {
            System.out.println("Invalid username entered: " + e.getMessage());
        }
    }

    public static void validateUsername(String username) throws InvalidUsernameException {
        if (username.isEmpty()) {
            throw new InvalidUsernameException("Username cannot be empty.");
        }
        if (username.length() < 5 || username.length() > 20) {
            throw new InvalidUsernameException("Username must be between 5 and 20 characters.");
        }
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            throw new InvalidUsernameException("Username can only contain letters and numbers.");
        }
    }
}

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}
