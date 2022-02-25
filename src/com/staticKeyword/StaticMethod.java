package com.staticKeyword;
class DemoClass{
    static void display(){
        System.out.println("This message from display method");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        DemoClass.display();
    }
}
