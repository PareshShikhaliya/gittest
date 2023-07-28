package Module1.class21;

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000);

        try {
            account.withdraw(1500);
            System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }
}

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw " + amount);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
