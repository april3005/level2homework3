package com.company;

public class BankAccount {
    private double amount;
    private double sum;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        amount = amount + sum;
        System.out.println("Your new balance is: " + amount);
        return amount;
    }

    public double withdraw(double sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("Извините, недостаточно средств для снятия", amount);
        }
        amount = amount - sum;
        return amount;
    }
}
