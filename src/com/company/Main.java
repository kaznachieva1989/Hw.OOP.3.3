package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        System.out.println("Остаток на вашем счете = " + bankAccount.getAmount());
        int x = 0;
        while (x == 0) {
            try {
                bankAccount.withDraw(3000);
                System.out.println("Остаток после снятия = " + bankAccount.getAmount());
            } catch (LimitException le) {
                le.printStackTrace();
                x = 1;
                bankAccount.withDraw(bankAccount.getAmount());
                System.out.println("Остаток после снятия = " + bankAccount.getAmount());
            }
        }
    }
}

