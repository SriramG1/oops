package com.Final;

final class First{
    final int age=10;
    String name="Sriram";
    public void method(){
        System.out.println("This message from first class in at method");
    }
}
public class FinalClass {
    public static void main(String[] args) {
        First first = new First();
        first.method();
    }
}
