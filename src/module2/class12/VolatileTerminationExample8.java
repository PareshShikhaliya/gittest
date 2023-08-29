package module2.class12;

class GracefulTerminator extends Thread {
    private volatile boolean terminate = false;

    public void run() {
        while (!terminate) {
            // Perform some work here
            System.out.println("Working...");
        }
        System.out.println("Termination signal received.");
    }

    public void shutdown() {
        terminate = true;
    }
}

public class VolatileTerminationExample8 {
    public static void main(String[] args) throws InterruptedException {
        GracefulTerminator terminator = new GracefulTerminator();
        terminator.start();

        // Let the thread work for a while
        Thread.sleep(1000);

        terminator.shutdown(); // Signal the thread to stop
        terminator.join(); // Wait for the thread to terminate
    }
}
