package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        int x = 0;
        while (x == 0) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException le) {
                le.printStackTrace();
                x = 1;
            }
        }
    }
}
