package com.company;

public class BankAccount {
    private double amount;

    public double getAmount(int i) {
        return amount;
    }

    public double deposit(double sum) {
        double summi = sum = +amount;
        this.amount = summi;
        return summi;
    }

    public double withDraw(double sum) throws LimitException {
        double minus = amount - sum;
        this.amount = minus;
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма меньше остатка. Остаток = ", minus);
        }
        return minus;
    }
}
