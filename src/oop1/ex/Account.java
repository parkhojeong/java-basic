package oop1.ex;

public class Account {
    int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }
}
