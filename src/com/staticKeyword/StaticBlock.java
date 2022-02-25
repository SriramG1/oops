package com.staticKeyword;
class Demo{
    Demo(){
        System.out.println("This message from constructor");
    }
    void displayOne(){
        System.out.println("This message is from display method one");
    }
    static{
        System.out.println("This message from static block");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.displayOne();
    }
}
