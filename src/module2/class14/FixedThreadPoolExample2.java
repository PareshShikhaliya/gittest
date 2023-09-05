package module2.class14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample2 {
    public static void main(String[] args) {
        // Create a Fixed Thread Pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks to the executor
        for (int i = 1; i <= 5; i++) {
            executor.submit(new Task("Task " + i));
        }

        // Shutdown the executor when done
        executor.shutdown();
    }

    static class Task implements Runnable {
        private final String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Executing " + name + " on thread: " + Thread.currentThread().getName());
        }
    }
}

/*
Using a newFixedThreadPool is beneficial when you want to control the level of concurrency in your application and ensure that a specific number of threads are always available for executing tasks without overwhelming your system with too many threads.
 */
