package module2.class11;

class MyThread extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
        }
    }
}

public class ThreadExample1 {
    public static void main(String[] args)
    {
        System.out.println("which thread i am running now "+ Thread.currentThread().getName());
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // Starts the execution of thread1
        thread2.start(); // Starts the execution of thread2

        // Main thread continues to execute alongside thread1 and thread2
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
