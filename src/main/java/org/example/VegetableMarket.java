package org.example;

// good explanation:
// https://stackoverflow.com/questions/3047564/java-synchronized-method-lock-on-object-or-method

// to sum up:
// 1) USING synchronized ON METHODS WILL LOCK ALL OBJECT
// 2) it possible (and BETTER) to lock ONLY vars BUT must be OBJECT, so can be worst for box/unbox for primitive types.
// 3) granular access SEEMS NOT WORK!!!!


public class VegetableMarket {

    private Integer apples = 0;
    private Integer oranges = 0;


    synchronized public void incApples() {
        apples += 1;
    }

    public void granularIncApples() {
        synchronized (apples) {
            apples += 1;
        }
    }

    // oranges
    synchronized public void incOranges() {
        oranges += 1;
    }

    public void granularIncOranges() {
        synchronized (oranges) {
            oranges += 1;
        }
    }



    public void reset() {
        apples = 0;
        oranges = 0;
    }

    public void show() {
        System.out.println("final amount: apples: " + apples + "  oranges: " + oranges);
    }
}
