package com.staticKeyword;

public class Static {
    static int count=0;
    public Static(){
        count+=5;
        display();
    }
    void display(){
        System.out.println(count);
    }
    public static void main(String[] args) {
        System.out.println("Start of main method");
        Static staticDemo = new Static();
        Static staticDemo1 = new Static();
        Static staticDemo2 = new Static();
    }
}
