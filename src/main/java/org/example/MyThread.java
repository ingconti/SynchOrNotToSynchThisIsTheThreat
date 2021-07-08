package org.example;


import java.util.List;

public class MyThread extends Thread {

    private static final int maxIterations = 2000;

    private String name;
    private boolean UP;
    private BankAccount bankAccount;

    public MyThread(String  name, Boolean UP, BankAccount bankAccount) {
        this.name = name;
        this.UP = UP;
        this.bankAccount = bankAccount;
    }

    public void run() {
        System.out.println(name + " is running...");
        int count = 0;

        do {
            if (UP){
                bankAccount.inc(1);
            }else{
                bankAccount.dec(1);
            }

        } while (count++<maxIterations);

        System.out.println(name + " has done!");

    }
}
