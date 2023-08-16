package module2.class9;

class Resource {
    private String name;

    public Resource(String name) {
        this.name = name;
    }

    // Cleanup or resource release in finalize method
    @Override
    protected void finalize() {
        System.out.println("Finalizing resource: " + name);
        // Perform cleanup or resource release here
    }
}

public class FinalizeExample7 {
    public static void main(String[] args) {
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        // Nullify references to the objects to make them eligible for garbage collection
        resource1 = null;
        resource2 = null;

        // Explicitly call the garbage collector (not recommended in real applications)
        System.gc(); // This suggests that the garbage collector should run
        System.out.println("After requesting garbage collection");

        // Sleep to allow the garbage collector to run (not recommended in real applications)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program");
    }
}
