package com.prabeshpaudel;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private long accountNumber;
    private String name;
    private Credentials credential;
    private double balance;
    ArrayList<Double> transactions;
    private Scanner scanner = new Scanner(System.in);
    private long min = 10000000;
    private long max = 99999999;

    public Account() {
        System.out.print("Enter the account name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter a username: ");
        String user = scanner.nextLine();

        String pass1 = "a";
        String pass2 = "b";

        while(!pass1.equals(pass2)) {
            System.out.print("Enter a password: ");
            pass1 = scanner.nextLine();
            System.out.print("Enter your password again: ");
            pass2 = scanner.nextLine();
            if(!pass1.equals(pass2)) {
                System.out.println("The passwords don't match");
            }
        }

        credential = new Credentials(user, pass1);
        balance = 0;
        this.accountNumber = (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public void deposit(double amount) {
        if(amount < 0) {
            System.out.println("The deposit cannot be negative");
        } else {
            balance += amount;
            transactions.add(amount);
        }
    }
    public void withdraw (double amount) {
        if(amount < 0) {
            System.out.println("The deposit cannot be negative");
        } else {
            balance -= amount;
            transactions.add(-amount);
        }
    }

    public void printTransactions() {
        for(double d: transactions) {
            System.out.println(d);
        }
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
}
