package module2.class14;

public class SynchronizationProblemExample6 {
    private static int sharedCounter = 0;
    private static final int NUM_THREADS = 4;
    private static final int NUM_INCREMENTS = 10000;

    public static void main(String[] args) {
        Thread[] threads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < NUM_INCREMENTS; j++) {
                    sharedCounter++; // Increment the shared counter without synchronization
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Shared counter: " + sharedCounter);
    }
}
