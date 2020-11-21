package ch22_Multithreading.chapter_examples.section5;

/**
 * This program runs threads that deposit and withdraw money from the same bank account.
 */
public class BankAccountThreadRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        final double AMOUNT = 100;
        final int REPETITIONS = 100;
        final int THREADS = 100;

        for (int i = 1; i <= THREADS; i++) {
            DepositRunnable deposit = new DepositRunnable(account, AMOUNT, REPETITIONS);
            WithdrawRunnable withdraw = new WithdrawRunnable(account, AMOUNT, REPETITIONS);

            Thread depositThread = new Thread(deposit);
            Thread withdrawThread = new Thread(withdraw);

            depositThread.start();
            withdrawThread.start();
        }
    }
}