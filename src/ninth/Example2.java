package ninth;

public class Example2 {
    public static void main(String[] args) {
        final double SALES_TAX_RATE = 0.08; // declaring sales tax rate as a constant

        double price = 25.0;
        double tax = price * SALES_TAX_RATE; // calculating the sales tax

        System.out.println("The sales tax is: $" + tax); // printing the result
    }
}

