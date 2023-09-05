package module2.class13;

class ChatUser implements Runnable {
    private String username;

    public ChatUser(String username) {
        this.username = username;
    }

    @Override
    public void run()
    {
        System.out.println(username + " has joined the chat.");
        while (true) {
            // Simulate sending and receiving messages
            System.out.println(username + " is typing...");
            try {
                Thread.sleep(2000); // Simulate some processing time
            } catch (InterruptedException e) {
            }
            System.out.println(username + " has sent a message.");
        }
    }
}

public class ChatApplication1 {
    public static void main(String[] args) {
        ThreadGroup chatGroup = new ThreadGroup("ChatGroup");

        Thread user1Thread = new Thread(chatGroup, new ChatUser("User1"));
        Thread user2Thread = new Thread(chatGroup, new ChatUser("User2"));

        user1Thread.start();
        user2Thread.start();

        // Simulate the chat for a while
        try {
            Thread.sleep(10000); // Simulate chat time
        } catch (InterruptedException e) {
            System.out.println("awake");
        }

        // Interrupt all threads when the chat is over

        /*
        In the context of the chat application, calling chatGroup.interrupt();
         is a way to signal all the chat user threads that the chat session is over and it's time to stop.
          Each chat user thread periodically checks for interrupts (using methods like Thread.currentThread().isInterrupted()),
           and when they detect the interrupt flag is set, they can perform any necessary cleanup and exit their execution loop,
            thus ending the thread's operation.
                In the given example, the chat user threads are designed to run indefinitely,
                 simulating a chat session. When chatGroup.interrupt(); is called, it's a way to trigger these threads to stop their
                 simulated chat activities and exit gracefully.
         */
    }
}
