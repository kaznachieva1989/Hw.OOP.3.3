package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        amount = amount + sum;
        return amount;
    }

    public double withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма меньше остатка. Остаток = ", amount);
        }
        amount = amount - sum;
        return amount;
    }
}
