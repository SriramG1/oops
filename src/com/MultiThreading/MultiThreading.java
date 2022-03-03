package com.MultiThreading;

import java.lang.*;
class Threading extends Thread {
    public void run() {
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }
            System.out.println("Another thread");
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        Threading th= new Threading();
        th.start();
        for(int i=1;i<=10;i++){
            Thread.sleep(101);
            System.out.println("Main thread");
        }
    }
}
