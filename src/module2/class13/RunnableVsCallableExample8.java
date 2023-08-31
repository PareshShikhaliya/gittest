package module2.class13;

import java.util.concurrent.*;

class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable task is running.");
    }
}

class CallableTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Callable task is running.");
        return "Callable task result";
    }
}

public class RunnableVsCallableExample8 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        RunnableTask runnableTask = new RunnableTask();
        CallableTask callableTask = new CallableTask();

        // Submit Runnable task to the executor
        executor.submit(runnableTask);

        // Submit Callable task to the executor
        Future<String> future = executor.submit(callableTask);

        try {
            // Get the result from the Callable task
            String result = future.get();
            System.out.println("Callable task result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
