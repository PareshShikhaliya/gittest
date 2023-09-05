package module2.class14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample5 {
    public static void main(String[] args) {
        // Create a Cached Thread Pool
        ExecutorService executor = Executors.newCachedThreadPool();

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
