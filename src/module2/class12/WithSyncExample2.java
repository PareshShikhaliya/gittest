package module2.class12;


class CounterWithSync {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class IncrementerWithSync implements Runnable {
    private CounterWithSync counter;

    public IncrementerWithSync(CounterWithSync counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}

public class WithSyncExample2 {
    public static void main(String[] args) throws InterruptedException {
        CounterWithSync counter = new CounterWithSync();

        Thread thread1 = new Thread(new IncrementerWithSync(counter));
        Thread thread2 = new Thread(new IncrementerWithSync(counter));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter value with synchronization: " + counter.getCount());
    }
}
