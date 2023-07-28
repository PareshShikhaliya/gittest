package Module1.class21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionExample {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";

        try {
            // Establish a database connection
            Connection connection = DriverManager.getConnection(dbUrl, username, password);

            // Perform database operations
            // ...

            System.out.println("Database connection established successfully.");
        } catch (SQLException e) {
            // Handle the exception
            System.out.println("An error occurred while establishing the database connection: " + e.getMessage());
        }
    }
}
