package module2.class14;

public class WebServer10 {
    private static ThreadLocal<User> userThreadLocal = ThreadLocal.withInitial(() -> null);

    public static void main(String[] args) {
        // Simulate incoming HTTP requests
        for (int i = 1; i <= 3; i++) {
            User user = new User("User" + i);
            handleRequest(user);
        }
    }

    public static void handleRequest(User user)
    {
        // Store user information in ThreadLocal for the current thread
        userThreadLocal.set(user);

        // Process the request
        //processRequest();

        // Retrieve and clear the user information when done
        User currentUser = userThreadLocal.get();
        System.out.println("Request handled for user: " + currentUser.getName());
        userThreadLocal.remove();
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
