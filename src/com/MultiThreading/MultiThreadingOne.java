package com.MultiThreading;

class Multi implements java.lang.Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(101);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("multi class");
        }
    }
}
public class MultiThreadingOne {
    public static void main(String[] args) throws InterruptedException{
        Multi multi = new Multi();
        Thread thread = new Thread(multi);
        thread.start();
        for(int i=0;i<10;i++){
            Thread.sleep(100);
            System.out.println("main thread");
        }
    }
}
