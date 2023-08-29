package module2.class12;

public class YieldVsSleepExample10 {
    public static void main(String[] args) {
        // Thread using yield
        Thread yieldThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Yield Thread: " + i);
                Thread.yield(); // Suggest yielding to other threads
                /*
                , "yielding" means voluntarily giving up or relinquishing something,
                often referring to a thread giving up its current use of the processor's time in
                favor of allowing other threads to execute
                The goal of yielding is to improve fairness and prevent any single
                 thread from monopolizing the CPU's time, leading to better overall
                  system performance and responsiveness.
                 */
            }
        });

        // Thread using sleep
        Thread sleepThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Sleep Thread: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        yieldThread.start();
        sleepThread.start();
    }
}
