package org.example;


import java.util.List;

public class MyThread extends Thread {

    private static final int maxIterations = 10000;

    private String name;
    private boolean UP;
    private boolean moreGranularAccess;
    private BankAccount bankAccount;

    public MyThread(String  name, Boolean UP, Boolean moreGranularAccess,  BankAccount bankAccount) {
        this.name = name;
        this.UP = UP;
        this.moreGranularAccess = moreGranularAccess;
        this.bankAccount = bankAccount;
    }

    public void run() {
        System.out.println(name + " is running...");
        int count = 0;

        long start = System.nanoTime();

        do {
            if (UP){
                if (moreGranularAccess)
                    bankAccount.granularInc();
                else
                    bankAccount.inc();
            }else{
                if (moreGranularAccess)
                    bankAccount.granularDec();
                else
                    bankAccount.dec();
            }

        } while (count++<maxIterations);

        long finish = System.nanoTime();
        long timeElapsed = finish - start;

        System.out.println(name + " has done "  + timeElapsed);

    }
}
