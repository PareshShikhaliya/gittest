package third;


import java.util.Scanner;

public class IFEXample8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        String password = "password123";

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login successful!");
        } else if (inputUsername.equals(username)) {
            System.out.println("Incorrect password!");
        } else {
            System.out.println("Invalid username!");
        }


        boolean hasAccount = false;
        if (!hasAccount) {
            System.out.println("Please create an account");
        } else {
            System.out.println("Welcome back");
        }


         scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Welcome, " + name + "!");
        } else {
            System.out.println("Sorry, you are not authorized to access this service.");
        }




    }
}
