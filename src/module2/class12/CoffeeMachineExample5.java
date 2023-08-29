package module2.class12;

class CoffeeMachine {
    private int cupsAvailable = 5; // Total cups available

    // Synchronized method for making coffee
    public synchronized void makeCoffee(String person) {
        if (cupsAvailable > 0) {
            System.out.println(person + " made a coffee. Remaining cups: " + --cupsAvailable);
        } else {
            System.out.println(person + " couldn't make coffee, no cups left.");
        }
    }

    // Synchronized block for refilling cups
    public void refillCups(String person) {
        synchronized (this) {
            if (cupsAvailable == 0) {
                System.out.println(person + " is refilling cups.");
                cupsAvailable = 5;
                System.out.println("Cups refilled by " + person + ". Total cups available: " + cupsAvailable);
            }
        }
    }
}

public class CoffeeMachineExample5 {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        // Person 1 making coffee
        Thread person1Thread = new Thread(() -> {
            machine.makeCoffee("Person 1");
        });

        // Person 2 making coffee
        Thread person2Thread = new Thread(() -> {
            machine.makeCoffee("Person 2");
        });

        // Person 1 refilling cups
        Thread person1RefillThread = new Thread(() -> {
            machine.refillCups("Person 1");
        });

        // Person 2 refilling cups
        Thread person2RefillThread = new Thread(() -> {
            machine.refillCups("Person 2");
        });

        // Start the threads
        person1Thread.start();
        person2Thread.start();
        person1RefillThread.start();
        person2RefillThread.start();
    }
}
