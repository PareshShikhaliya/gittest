package module2.class14;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerWithSync8 {
    private static List<Integer> buffer = new ArrayList<>();
    private static final int BUFFER_CAPACITY = 5;

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                produce(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                consume();
            }
        });

        producer.start();
        consumer.start();
    }

    static void produce(int item) {
        synchronized (buffer)
        {
            while (buffer.size() >= BUFFER_CAPACITY)
            {
                try {
                    buffer.wait(); // Wait if the buffer is full
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            buffer.notify(); // Notify waiting consumers
        }
    }

    static void consume() {
        synchronized (buffer) {
            while (buffer.isEmpty()) {
                try {
                    buffer.wait(); // Wait if the buffer is empty
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int item = buffer.remove(0);
            System.out.println("Consumed: " + item);
            buffer.notify(); // Notify waiting producers
        }
    }
}
