package module2.class14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkStealingPoolExample3
{
    public static void main(String[] args) {
        // Create a Work-Stealing Thread Pool with the default number of threads
        ExecutorService executor = Executors.newWorkStealingPool();

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

