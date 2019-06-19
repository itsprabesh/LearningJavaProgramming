package com.prabeshpaudel;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account();
        myAccount.deposit(100.0);
        myAccount.deposit(23.54);
        myAccount.withdraw(32.0);
        myAccount.deposit(34.4);
        myAccount.withdraw(5.34);
        myAccount.deposit(109.0);
        myAccount.withdraw(22.4);
        System.out.println(myAccount.getBalance());
        myAccount.printTransactions();
        System.out.println(myAccount.getAccountNumber());
    }
}
