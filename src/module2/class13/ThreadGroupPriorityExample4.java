package module2.class13;

class PriorityTaskWithThreadGroup implements Runnable {
    private String taskName;

    public PriorityTaskWithThreadGroup(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskName + " is starting.");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Task " + taskName + " - Step " + i);
            Thread.yield(); // Give other threads a chance to run
        }
        System.out.println("Task " + taskName + " is complete.");
    }
}

public class ThreadGroupPriorityExample4 {
    public static void main(String[] args) {
        ThreadGroup taskGroup = new ThreadGroup("TaskGroup");

        Thread highPriorityThread = new Thread(taskGroup, new PriorityTaskWithThreadGroup("High Priority"));
        Thread normalPriorityThread = new Thread(taskGroup, new PriorityTaskWithThreadGroup("Normal Priority"));
        Thread lowPriorityThread = new Thread(taskGroup, new PriorityTaskWithThreadGroup("Low Priority"));

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        highPriorityThread.start();
        normalPriorityThread.start();
        lowPriorityThread.start();

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
