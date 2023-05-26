package class13;

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Account {
        private String accountNumber;
        private double balance;

        public Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds.");
            }
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank("XYZ Bank");

        // Creating account instances using the static nested class
        Account account1 = new Account("123456", 1000.0);
        Account account2 = new Account("789012", 5000.0);

        // Accessing account details and performing operations
        System.out.println("Bank Name: " + bank.getName());
        System.out.println("Account 1 Number: " + account1.getAccountNumber());
        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Number: " + account2.getAccountNumber());
        System.out.println("Account 2 Balance: " + account2.getBalance());

        // Performing deposit and withdrawal operations
        account1.deposit(500.0);
        account2.withdraw(2000.0);

        // Checking updated balances
        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
    }
}
