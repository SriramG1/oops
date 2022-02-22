package com.Final;

class Parent{
    public void show(){
        System.out.println("it is show");
    }
   final void display(){
        System.out.println("it is display");
    }
}
class Child extends Parent{
    @Override
    public void show() {
        System.out.println("It is show  from child");
    }
}
public class FinalMethod {
    public static void main(String[] args) {
        Child child=new Child();
        child.show();
        child.display();

    }
}
