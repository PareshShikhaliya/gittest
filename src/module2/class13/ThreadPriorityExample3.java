package module2.class13;

class PriorityTask implements Runnable {
    private String taskName;

    public PriorityTask(String taskName) {
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

public class ThreadPriorityExample3 {
    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(new PriorityTask("High Priority"));
        Thread normalPriorityThread = new Thread(new PriorityTask("Normal Priority"));
        Thread lowPriorityThread = new Thread(new PriorityTask("Low Priority"));

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        highPriorityThread.start();
        normalPriorityThread.start();
        lowPriorityThread.start();
    }
}
