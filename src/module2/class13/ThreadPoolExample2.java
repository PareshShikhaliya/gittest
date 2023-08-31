package module2.class13;

class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskName + " is starting.");
        try {
            Thread.sleep(3000); // Simulate task execution time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupt status
        }
        System.out.println("Task " + taskName + " is complete.");
    }
}

public class ThreadPoolExample2 {
    public static void main(String[] args) {
        ThreadGroup taskGroup = new ThreadGroup("TaskGroup");

        // Create and start worker threads within the ThreadGroup
        Thread task1Thread = new Thread(taskGroup, new Task("Task 1"));
        Thread task2Thread = new Thread(taskGroup, new Task("Task 2"));
        Thread task3Thread = new Thread(taskGroup, new Task("Task 3"));

        task1Thread.start();
        task2Thread.start();
        task3Thread.start();

        // Wait for all threads in the ThreadGroup to finish before proceeding
        waitForThreadsToFinish(taskGroup);

        System.out.println("All tasks are complete.");
    }

    private static void waitForThreadsToFinish(ThreadGroup group) {
        Thread[] threads = new Thread[group.activeCount()];
        group.enumerate(threads);
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
