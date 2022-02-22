package com.Constructor;

class Overloading{
    Overloading(){
        System.out.println("Enter Student Details :");
    }
    Overloading(String name){
        System.out.println("Student name is : "+name);
    }
    Overloading(String name,int rollNumber){
        System.out.println("Student name is : "+name);
        System.out.println("Student roll number is : "+rollNumber);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Overloading over=new Overloading();
        Overloading overOne=new Overloading("Sriram");
        Overloading overTwo=new Overloading("Sriram",9527);
    }
}
