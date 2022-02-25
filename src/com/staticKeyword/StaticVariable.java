package com.staticKeyword;

public class StaticVariable {
    static int count=0;
    public StaticVariable(){
        count+=5;
    }
    void display(){
        System.out.println(count);
    }
    public static void main(String[] args) {
        System.out.println("Start of main method");
        StaticVariable staticDemo = new StaticVariable();
        StaticVariable staticDemo1 = new StaticVariable();
        StaticVariable staticDemo2 = new StaticVariable();
    }
}
