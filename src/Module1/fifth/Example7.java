package Module1.fifth;

public class Example7 {

    public static void main(String[] args) {
        int i = 0;

        // while loop
        while (i < 0) {
            System.out.println("This will never be printed.");
        }

        // do-while loop
        do {
            System.out.println("This will be printed once.");
        } while (i < 0);
    }

}

