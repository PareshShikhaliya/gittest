package module2.class12;

class SharedResourceNew {
    // Class-level synchronized methods
    public static synchronized void classMethod1() {
        System.out.println("Class Method 1 - Start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Class Method 1 - End");
    }

    public static synchronized void classMethod2() {
        System.out.println("Class Method 2 - Start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Class Method 2 - End");
    }

    // Instance-level synchronized methods
    public synchronized void instanceMethod1() {
        System.out.println("Instance Method 1 - Start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Instance Method 1 - End");
    }

    public synchronized void instanceMethod2() {
        System.out.println("Instance Method 2 - Start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Instance Method 2 - End");
    }
}

public class SynchronizedMethodExample11 {
    public static void main(String[] args) {
        // Create two instances of SharedResource
        SharedResourceNew sharedResource1 = new SharedResourceNew();
        SharedResourceNew sharedResource2 = new SharedResourceNew();

        // Thread accessing class-level synchronized methods on the same instance
        Thread thread1 = new Thread(() -> {
            sharedResource1.classMethod1();
        });

        // Thread accessing class-level synchronized methods on the same instance
        Thread thread2 = new Thread(() -> {
            sharedResource1.classMethod2();
        });

        // Thread accessing instance-level synchronized methods on different instances
        Thread thread3 = new Thread(() -> {
            sharedResource2.instanceMethod1();
        });

        // Thread accessing instance-level synchronized methods on different instances
        Thread thread4 = new Thread(() -> {
            sharedResource2.instanceMethod2();
        });

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
