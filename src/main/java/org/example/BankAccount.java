package org.example;

// good explanation:
// https://stackoverflow.com/questions/3047564/java-synchronized-method-lock-on-object-or-method

// to sum up:
// 1) USING synchronized ON METOHOS WILL LOCK ALL OBJECT
// 2) it possible (nd BETTER) to lock ONLY vars BUT must be OBJECT, so can be worst for box unbox for primitive types.
// 3) granual Access SEEMS NOT WORK!!!!


public class BankAccount {

    private Integer amount = 0;


    synchronized public void inc(){
        amount+=1;
    }

    synchronized public void dec(){
        amount-=1;
    }


     public void granularInc(){
         synchronized(amount) {
         //    synchronized(this) {
             amount+=1;
         }
    }

     public void granularDec(){
         synchronized(amount) {
         //synchronized(this) {
             amount-=1;
         }
    }


    public void reset(){
        amount=0;
    }

    public void show(){
        System.out.println("\n" + amount);
    }
}
