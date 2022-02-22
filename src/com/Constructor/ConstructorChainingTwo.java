package com.Constructor;

class ConstructorDemo{
    ConstructorDemo(int num){
        this(10,20);
        System.out.println("Constructor with a single parameter " +num);
    }
    ConstructorDemo(int num1,int num2){
        this(10,20,30);
        System.out.println("Constructor with a two Parameters parameter "+num1+" "+num2);
    }
    ConstructorDemo(int num1,int num2,int num3){
        System.out.println("Constructor with a Three Parameters parameter "+num1+" "+num2+" "+num3);
    }
}
public class ConstructorChainingTwo {
    public static void main(String[] args) {
        ConstructorDemo obj=new ConstructorDemo(10);
    }
}
