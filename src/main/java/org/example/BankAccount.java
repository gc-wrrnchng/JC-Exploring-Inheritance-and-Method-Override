package org.example;

// Parent Class
class BankAccount {
    protected double balance;

    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public double getBalance() {
        return this.balance;
    }
}

// Child Class
class CheckingAccount extends BankAccount {
    private double fee = 5.0;

    public CheckingAccount(double startingBalance) {
        super(startingBalance);
    }

    public void deductMonthlyFee() {
        balance -= fee;
        System.out.println("Fee deducted. New balance: " + balance);
    }
}
