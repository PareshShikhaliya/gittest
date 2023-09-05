package module2.class14;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample4 {
    public static void main(String[] args)
    {
        // Create a Scheduled Thread Pool with 3 threads
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);

        // Schedule a task to run after a fixed delay of 2 seconds
        executor.schedule(new DelayedTask("Delayed Task"), 2, TimeUnit.SECONDS);

        // Schedule a task to run periodically every 3 seconds
        executor.scheduleAtFixedRate(new PeriodicTask("Periodic Task"), 0, 3, TimeUnit.SECONDS);

        // Schedule a task to run with an initial delay of 1 second and then periodically every 4 seconds
        executor.scheduleWithFixedDelay(new DelayedPeriodicTask("Delayed Periodic Task"), 1, 4, TimeUnit.SECONDS);
    }

    static class DelayedTask implements Runnable {
        private final String name;

        public DelayedTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Executing " + name + " after a delay on thread: " + Thread.currentThread().getName());
        }
    }

    static class PeriodicTask implements Runnable {
        private final String name;

        public PeriodicTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Executing " + name + " periodically on thread: " + Thread.currentThread().getName());
        }
    }

    static class DelayedPeriodicTask implements Runnable {
        private final String name;

        public DelayedPeriodicTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Executing " + name + " periodically with an initial delay on thread: " + Thread.currentThread().getName());
        }
    }
}
