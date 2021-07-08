package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "started!" );


        BankAccount bankAccount = new BankAccount();

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

        System.out.println("ALL DONE");
        bankAccount.show();

    }
}
