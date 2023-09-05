package module2.class14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample1 {
    public static void main(String[] args) {
        // Create a Single Thread Executor

        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit tasks to the executor
        executor.submit(new Task("Task 1"));
        executor.submit(new Task("Task 2"));
        executor.submit(new Task("Task 3"));

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
The most significant advantage of a Single Thread Executor is that it enforces sequential execution
of tasks. Tasks are processed one after another in the order they are submitted.
This is particularly useful for tasks that depend on each other's results
or access shared resources that can't be accessed concurrently without synchronization
 */
