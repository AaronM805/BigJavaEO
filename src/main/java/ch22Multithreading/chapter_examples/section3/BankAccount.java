package ch22Multithreading.chapter_examples.section3;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {
    private double balance;

    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount() {
        this.balance = 0;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        System.out.print("Depositing " + amount);
        balance += amount;
        System.out.println(", new balance is " + balance);
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        System.out.print("Withdrawing " + amount);
        balance += amount;
        System.out.println(", new balance is " + balance);
    }
}