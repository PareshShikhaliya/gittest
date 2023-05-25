package class11;
public class BankAccount {
    private int accountNumber; // Encapsulated private account number
    private String accountHolderName; // Encapsulated private account holder's name
    private double balance; // Encapsulated private account balance

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // Add the amount to the balance
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            // Subtract the amount from the balance
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount(123456, "John Doe", 1000.0);

        // Perform operations on the account

        // Deposit money into the account
        account.deposit(500.0);

        // Withdraw money from the account
        account.withdraw(200.0);

        // Try to withdraw more money than the available balance
        account.withdraw(1500.0);

        // Retrieve the account balance
        double balance = account.getBalance();
        System.out.println("Current balance: " + balance);
    }
}
