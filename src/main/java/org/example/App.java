package org.example;


public class App {
    static VegetableMarket market = new VegetableMarket();

    public static void main(String[] args) {

        //code(false);
        code(true);

        System.out.println("ALL DONE ");
        market.show();

    }

    public static void code(Boolean moreGranularAccess) {
        System.out.println("started code!");

        MyThread th1 = new MyThread("ONE", MyThread.BuyAction.BUY_APPLE, moreGranularAccess, market);
        MyThread th2 = new MyThread("TWO", MyThread.BuyAction.BUY_ORANGES, moreGranularAccess, market);
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
