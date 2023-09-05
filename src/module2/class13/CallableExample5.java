package module2.class13;

import module2.class11.ThreadExample1;

import java.util.concurrent.*;

class MyCallable implements Callable<Integer>
{
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        Thread.sleep(3000);
        return sum;
    }
}

public class CallableExample5 {
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = new MyCallable();


        Future<Integer> future = executor.submit(callable);
        System.out.println("task is done ? "+future.isDone());


        try {
            System.out.println("are we still executing????????????????????");
            int result = future.get(); // Waits for the task to complete and retrieves the result
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
