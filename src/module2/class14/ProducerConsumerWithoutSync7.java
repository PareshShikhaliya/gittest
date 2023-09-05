package module2.class14;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerWithoutSync7 {
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
        if (buffer.size() < BUFFER_CAPACITY) {
            buffer.add(item);
            System.out.println("Produced: " + item);
        }
    }

    static void consume() {
        if (!buffer.isEmpty()) {
            int item = buffer.remove(0);
            System.out.println("Consumed: " + item);
        }
    }
}
