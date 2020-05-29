package com.dawidciesielski;

public class Main {

    public static void main(String[] args) {
	Account dawidsAccount = new Account("Dawid");

	dawidsAccount.deposit(2500);
	dawidsAccount.deposit(-100);
	dawidsAccount.getBalance();
	dawidsAccount.withdraw(1000);
	dawidsAccount.withdraw(-200);
	dawidsAccount.calculateBalance();



    }
}
