package com.staticKeyword;
class Outer{
    static class Inner{
        void display(){
            System.out.println("This message from display method at inner class");
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.display();
    }
}
