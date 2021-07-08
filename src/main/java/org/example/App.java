package org.example;


public class App 
{
    static BankAccount bankAccount = new BankAccount();

    public static void main( String[] args )
    {

       // code(false);

       code(true);

        System.out.println("ALL DONE ");
        bankAccount.show();

    }

    public static void code(Boolean moreGranularAccess )
    {
        System.out.println( "started code!" );

        MyThread th1 = new MyThread("ONE", true, moreGranularAccess, bankAccount);
        MyThread th2 = new MyThread("TWO", false, moreGranularAccess, bankAccount);
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
