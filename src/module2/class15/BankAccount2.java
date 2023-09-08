package module2.class15;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount2 {
    private double balance;
    private List<Transaction> transactionHistory;

    public BankAccount2(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount));
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdrawal", amount));
        }
    }

    public void printTransactionHistory() {
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    // Inner class representing a transaction
    private class Transaction {
        private Date date;
        private String description;
        private double amount;

        public Transaction(String description, double amount) {
            this.date = new Date();
            this.description = description;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Date: " + date + ", Description: " + description + ", Amount: " + amount;
        }
    }

    public static void main(String[] args) {
        BankAccount2 account = new BankAccount2(1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.deposit(100.0);

        System.out.println("Transaction History:");
        account.printTransactionHistory();
    }
}
