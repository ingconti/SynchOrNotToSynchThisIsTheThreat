package org.example;

class x{
    private Integer a;
    private Integer b;
    public void addA(){
        synchronized(a) {
            a++;
        }
    }
    public synchronized void addB(){
        synchronized(b) {
            b++;
        }
    }
}