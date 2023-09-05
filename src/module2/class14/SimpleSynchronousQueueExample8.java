package module2.class14;

import java.util.concurrent.SynchronousQueue;

public class SimpleSynchronousQueueExample8 {
    public static void main(String[] args) {
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();

        // Producer thread (sends a message)
        Thread producerThread = new Thread(() -> {
            String message = "Hello from the producer!";
            try {
                synchronousQueue.put(message); // Put a message into the queue
                System.out.println("Producer sent: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread (receives a message)
        Thread consumerThread = new Thread(() -> {
            try {
                System.out.println("Consumer is waiting to receive...");
                String receivedMessage = synchronousQueue.take(); // Receive a message from the queue
                System.out.println("Consumer received: " + receivedMessage);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
