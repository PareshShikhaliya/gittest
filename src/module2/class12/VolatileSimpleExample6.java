package module2.class12;

class SharedResource {
    private volatile boolean flag = false; // A volatile boolean flag

    public void toggleFlag() {
        flag = !flag; // Flips the value of the flag
    }

    public boolean isFlagSet() {
        return flag; // Returns the current value of the flag
    }
}

public class VolatileSimpleExample6 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource(); // Create a shared resource

        // Thread 1: Modifies the flag value
        Thread thread1 = new Thread(() -> {
            resource.toggleFlag();
            System.out.println("Flag set to true by Thread 1");
        });

        // Thread 2: Reads the flag value
        Thread thread2 = new Thread(() -> {
            while (!resource.isFlagSet()) {
                // Wait until the flag becomes true
            }
            System.out.println("Flag is true in Thread 2");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
