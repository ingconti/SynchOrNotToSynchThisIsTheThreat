package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    static BankAccount bankAccount = new BankAccount();

    public static void main( String[] args )
    {

        long start = System.nanoTime();
        code();
        long finish = System.nanoTime();
        long timeElapsed1 = finish - start;

        start = System.nanoTime();
        //betterCode();
        finish = System.nanoTime();
        long timeElapsed2 = finish - start;

        System.out.println("ALL DONE " + timeElapsed1 + " " + timeElapsed2);
        bankAccount.show();

    }

    public static void code( )
    {
        System.out.println( "started code!" );

        MyThread th1 = new MyThread("ONE", true, bankAccount);
        MyThread th2 = new MyThread("TWO", false, bankAccount);
        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }




}
