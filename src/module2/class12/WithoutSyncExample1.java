package module2.class12;

class CounterWithoutSync {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class IncrementerWithoutSync implements Runnable {
    private CounterWithoutSync counter;

    public IncrementerWithoutSync(CounterWithoutSync counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}

public class WithoutSyncExample1 {
    public static void main(String[] args) throws InterruptedException {
        CounterWithoutSync counter = new CounterWithoutSync();

        Thread thread1 = new Thread(new IncrementerWithoutSync(counter));
        Thread thread2 = new Thread(new IncrementerWithoutSync(counter));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter value without synchronization: " + counter.getCount());
    }
}
