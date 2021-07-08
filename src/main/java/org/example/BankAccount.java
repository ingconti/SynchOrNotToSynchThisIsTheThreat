package org.example;

// good explanation:
// https://stackoverflow.com/questions/3047564/java-synchronized-method-lock-on-object-or-method

// to sum up:
// 1) USING synchronized ON METOHOS WILL LOCK ALL OBJECT
// 2) it possible (nd BETTER) to lonk ONLY vars;

public class BankAccount {

    private int amount = 0;


    synchronized public void inc(int delta){
        amount+=delta;
    }

    synchronized public void dec(int delta){
        amount-=delta;
    }


    public void reset(){
        amount=0;
    }

    public void show(){
        System.out.println("\n" + amount);
    }
}
