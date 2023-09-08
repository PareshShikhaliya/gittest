package module2.class15;

// Define a simple interface
interface Greeting {
    void greet();
}

public class AnonymousInnerClassExample7 {
    public static void main(String[] args) {
        // Anonymous Inner Class implementing the Greeting interface
        Greeting anonymousGreeting = new Greeting() {
            // Anonymous inner classes do not have a name.
            // They implement the interface's method within the class declaration.

            @Override
            public void greet() {
                System.out.println("Hello from anonymous inner class!");
            }
        };

        // Calling the greet method of the anonymous inner class
        anonymousGreeting.greet();

        // Another example: Anonymous Inner Class for Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running using an anonymous inner class.");
            }
        };

        // Create a thread and start it with the anonymous inner class as the runnable
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
