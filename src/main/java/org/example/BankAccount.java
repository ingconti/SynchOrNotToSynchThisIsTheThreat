package org.example;

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
