package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount bankAccount = new BankAccount();
	    bankAccount.deposit(10000);
	    while (true) {
            try {
                bankAccount.withdraw (6000);
            } catch (LimitException le) {
                System.out.println("Недостаточно средств для снятия указанной суммы. Ваш баланс " + bankAccount.getAmount());
                le.getRemainingAmount();
            }


        }
    }
}
