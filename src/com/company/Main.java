package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        System.out.println("Остаток на вашем счете = " + bankAccount.getAmount());
        int x = 0;
        while (x == 0) {
            if (bankAccount.getAmount() < 6000) {
                throw new LimitException("Запрашиваемая сумма меньше остатка. Остаток = ", bankAccount.getAmount());
            }
            try {
                bankAccount.withDraw(6000);
                System.out.println("Остаток после снятия = " + bankAccount.getAmount());
            } catch (LimitException le) {
                le.printStackTrace();
                x = 1;
            }
        }
    }
}

