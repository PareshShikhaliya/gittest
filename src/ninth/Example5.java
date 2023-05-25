package ninth;


public class Example5 {
    private int x = 10; // instance variable

    public void printX() {
        int x = 5; // local variable that hides the instance variable

        System.out.println("Local variable x = " + x); // prints 5

        {
            int y = 15; // block-scoped variable that hides both instance variable and local variable
            System.out.println("Block-scoped variable y = " + y); // prints 15
            System.out.println("Local variable x = " + x); // prints 5
            System.out.println("Instance variable x = " + this.x); // prints 10
        }

        System.out.println("Local variable x = " + x); // prints 5
        System.out.println("Instance variable x = " + this.x); // prints 10
    }
}


