package module2.class12;

class Counter {
    private volatile int count = 0; // A volatile counter

    public void increment() {
        count++; // Increment the counter
    }

    public int getCount() {
        return count; // Return the current count
    }
}

public class VolatileAtomicityExample7 {
    public static void main(String[] args) {
        Counter counter = new Counter(); // Create a counter

        // Thread 1: Increments the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
            {
                counter.increment();
            }
        });

        // Thread 2: Increments the counter
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
