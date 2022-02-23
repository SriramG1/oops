package com.Inheritance;
class GrandParent{
    int numberOne;
    int numberTwo;
    void addition(int a,int b){
        numberOne=a;
        numberTwo=b;
        System.out.println("Addition value is : "+(numberOne+numberTwo));
    }
}

class Parent extends GrandParent{
    void multiplication(){
        System.out.println("Multiplication value is : "+(numberOne*numberTwo));
    }
}

class Child extends Parent{
    void subtraction(){
        System.out.println("Subtraction value is : "+(numberOne-numberTwo));
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child child= new Child();
        child.addition(10,5);
        child.subtraction();
        child.multiplication();
    }
}
