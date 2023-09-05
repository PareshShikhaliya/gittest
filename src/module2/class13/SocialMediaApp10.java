package module2.class13;

import java.util.concurrent.*;

// Task to post updates for a user
class PostUpdateTask implements Runnable {
    private String userId;
    private String post;

    public PostUpdateTask(String userId, String post) {
        this.userId = userId;
        this.post = post;
    }

    @Override
    public void run() {
        // Display the user's post update
        System.out.println("User " + userId + " posted an update: " + post);
    }
}

// Task to send notifications to a user
class NotificationTask implements Runnable {
    private String userId;
    private String notification;

    public NotificationTask(String userId, String notification) {
        this.userId = userId;
        this.notification = notification;
    }

    @Override
    public void run() {
        // Display the user's received notification
        System.out.println("User " + userId + " received a notification: " + notification);
    }
}

// Scheduler for social media tasks
class SocialMediaScheduler
{
    private ScheduledExecutorService scheduler;

    public SocialMediaScheduler()
    {
        // Create a ScheduledExecutorService with a single thread
        scheduler = Executors.newScheduledThreadPool(1);
    }

    // Schedule a task to post updates for a user at fixed intervals
    public void schedulePostUpdate(String userId, String post)
    {
        // Create a task instance for posting updates
        Runnable task = new PostUpdateTask(userId, post);

        // Schedule the task to run every 1 hour
        scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.HOURS);
    }

    // Schedule a task to send notifications to a user with fixed delay
    public void scheduleNotification(String userId, String notification) {
        // Create a task instance for sending notifications
        Runnable task = new NotificationTask(userId, notification);

        // Schedule the task to run every 30 minutes with a delay after each execution
        scheduler.scheduleWithFixedDelay(task, 0, 30, TimeUnit.MINUTES);
    }

    // Stop the scheduler when it's no longer needed
    public void stopScheduler() {
        scheduler.shutdown();
    }
}

// Main application class
public class SocialMediaApp10 {
    public static void main(String[] args)
    {
        // Create an instance of SocialMediaScheduler
        SocialMediaScheduler socialMediaScheduler = new SocialMediaScheduler();

        // Schedule posts and notifications for a user
        socialMediaScheduler.schedulePostUpdate("user123", "Exciting news!");
        socialMediaScheduler.scheduleNotification("user123", "You have a new friend request!");

        // Allow the scheduler to run for a short time (simulated)
        try {
            Thread.sleep(5000); // Simulate app running for a short time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the scheduler when done using it
        socialMediaScheduler.stopScheduler();
    }
}

/*
In this example:

The SocialMediaScheduler class acts as the "factory" that creates instances of tasks (PostUpdateTask and NotificationTask)
based on the scheduling needs.
The PostUpdateTask and NotificationTask classes are the "products" created by the factory.

The Factory Method pattern is used indirectly in this scenario because the SocialMediaScheduler class uses different classes (PostUpdateTask and NotificationTask) to create instances of tasks based on the scheduling requirements. This pattern provides flexibility in extending or customizing the behavior of tasks without modifying the SocialMediaScheduler class itself.

In summary, while the main focus of the example is on scheduling tasks using the ScheduledExecutorService, it also demonstrates a form of the Factory Method pattern by creating different types of tasks through separate classes.
 */

