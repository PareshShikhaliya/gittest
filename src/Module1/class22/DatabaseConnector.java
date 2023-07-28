package Module1.class22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnectionException extends RuntimeException {
    public DatabaseConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class DatabaseConnector {
    public static void main(String[] args) {
        try {
            Connection connection = connectToDatabase("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
            // Perform database operations using the connection
            // ...
            connection.close();
        } catch (Exception e) {
            // Wrapping the checked exception inside a custom unchecked exception
            throw new DatabaseConnectionException("Error connecting to the database.", e);
        }
    }

    public static Connection connectToDatabase(String url, String username, String password) throws SQLException {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            // Wrapping the checked exception inside a custom unchecked exception
            throw new DatabaseConnectionException("Unable to establish a connection to the database.", e);
        }
    }
}

