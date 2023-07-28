package Module1.class19;

import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

 enum DatabaseConnection {
    INSTANCE;

    private Connection connection;

     DatabaseConnection() {
        // Private constructor to prevent direct instantiation
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
            System.out.println("Database connection established.");
        } catch (SQLException e) {
            System.out.println("Failed to establish database connection: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}

public class DatabaseConnectionMain {
    public static void main(String[] args) {
        // Retrieve the database connection
        Connection connection = DatabaseConnection.INSTANCE.getConnection();

        // Use the database connection for database operations
        // Perform database operations using the connection
        System.out.println("Performing database operations...");

        // Close the database connection when no longer needed
        try {
            connection.close();
            System.out.println("Database connection closed.");
        } catch (SQLException e) {
            System.out.println("Failed to close database connection: " + e.getMessage());
        }
    }
}
