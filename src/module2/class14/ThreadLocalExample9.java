package module2.class14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalExample9
{
    private static ThreadLocal<Integer> threadId = ThreadLocal.withInitial(() -> null);

    static class MyTask implements Runnable {
        private int taskId;

        public MyTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            threadId.set(taskId);

            System.out.println("Thread " + taskId + " is doing some work.");
            System.out.println("Thread " + taskId + " has ID: " + threadId.get());

            threadId.remove();
        }
    }

    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 3; i++) {
            Runnable task = new MyTask(i);
            executorService.submit(task);
        }

        executorService.shutdown();
    }
}
