package module2.class11;

class Baker implements Runnable {
    private String pastryName;
    private int bakingTime;

    public Baker(String pastryName, int bakingTime) {
        this.pastryName = pastryName;
        this.bakingTime = bakingTime;
    }

    public void run()
    {
        try {
            System.out.println(pastryName + " is being baked...");
            Thread.sleep(bakingTime); // Simulate baking time
            System.out.println(pastryName + " is ready!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BakerySimulation4 {
    public static void main(String[] args) {
        // Create threads for three different bakers
        Thread baker1 = new Thread(new Baker("Croissant", 3000)); // Takes 3 seconds to bake
        Thread baker2 = new Thread(new Baker("Cupcake", 2000));   // Takes 2 seconds to bake
        Thread baker3 = new Thread(new Baker("Baguette", 5000));  // Takes 5 seconds to bake

        // Start baking threads
        baker1.start();
        baker2.start();
        baker3.start();
    }
}
