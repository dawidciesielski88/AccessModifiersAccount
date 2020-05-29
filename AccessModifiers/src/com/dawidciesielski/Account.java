package com.dawidciesielski;

import java.util.ArrayList;

public class Account {

    public String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.transactions = new ArrayList<>();
        this.accountName = accountName;
    }

    public int getBalance() {
        System.out.println("You have " + balance + " available");
        return balance;
    }

    public void deposit (int amount) {
        if (amount>0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw (int fundsPaidOut) {
        if (fundsPaidOut > 0) {
            transactions.add(-(fundsPaidOut));
            this.balance -= fundsPaidOut;
            System.out.println(fundsPaidOut + " withdrawn. Balance is now " + this.balance);
        } else if (balance == 0) {
            System.out.println("Cannot withdraw requested amount. Balance is 0");
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }
        public void calculateBalance() {
            this.balance = 0;
            for (int i : this.transactions) {
                this.balance+=i;
                System.out.println("Calculated balance is " +this.balance);
            }
        }
    }




