package Module1.ninth;

public class Example4 {

    public int x = 10; // instance variable

    public void printX() {
        // local variable that hides the instance variable
           // int x = 100;
        System.out.println("Instance variable x = " +x); // prints 10
    }
    public static void main(String[] args)
    {
        Example4 instance1=new Example4();
        instance1.printX();


    }

}



