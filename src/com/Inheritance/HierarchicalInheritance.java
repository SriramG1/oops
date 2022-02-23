package com.Inheritance;
class One{
    int a=10;
    int b=20;
    void add(){
        System.out.println("Addition value is : "+(a+b));
    }
}
class Two extends One{
    int a=10;
    int b=20;
    void sub(){
        System.out.println("Subtraction value is : "+(a-b));
    }
}
class Three extends One{
    int a=10;
    int b=20;
    void mul(){
        System.out.println("Multiplication value is : "+(a*b));
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Two two=new Two();
        two.add();
        two.sub();
        Three three = new Three();
        three.add();
        three.mul();
    }
}
