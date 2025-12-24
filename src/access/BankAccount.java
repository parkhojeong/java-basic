package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (!isAmountValid(amount)) {
            System.out.println("Invalid amount.");
            return;
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (!isAmountValid(amount) || balance < amount) {
            System.out.println("Insufficient amount or balance.");
            return;
        }

        balance -= amount;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    public int getBalance() {
        return balance;
    }
}
