package fifth;

public class Example1_2 {
    public static void main(String[] args) {
        System.out.println("decrement loop");
        for (int i = 10; i > 0; i -= 2) {
            System.out.println(i);
        }

        System.out.println("increment loop");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

