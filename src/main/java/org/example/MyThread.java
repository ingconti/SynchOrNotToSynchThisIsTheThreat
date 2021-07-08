package org.example;


public class MyThread extends Thread {

    public enum BuyAction {
        BUY_ORANGES,
        BUY_APPLE;
    }

    private static final int maxIterations = 10000;

    private String name;
    private BuyAction action;
    private boolean moreGranularAccess;
    private VegetableMarket market;

    public MyThread(String name, BuyAction action, Boolean moreGranularAccess,  VegetableMarket market) {
        this.name = name;
        this.action = action;
        this.moreGranularAccess = moreGranularAccess;
        this.market = market;
    }

    public void run() {
        System.out.println(name + " is running...");
        int count = 0;

        long start = System.nanoTime();

        do {
            if (action == BuyAction.BUY_APPLE) {
                if (moreGranularAccess)
                    market.granularIncApples();
                else
                    market.incApples();
            } else {
                if (moreGranularAccess)
                    market.granularIncOranges();
                else
                    market.incOranges();
            }

        } while (++count < maxIterations);

        long finish = System.nanoTime();
        long timeElapsed = finish - start;

        System.out.println(name + " has done " + timeElapsed);

    }
}
