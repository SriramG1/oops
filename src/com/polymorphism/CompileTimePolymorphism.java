package com.polymorphism;

import java.util.Scanner;

class Overload{
    int multiply(int a,int b){
        return a*b;
    }
    float multiply(float a,float b){
        return a*b;
    }
    double multiply(double a,double b){
        return a*b;
    }

}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        Overload over= new Overload();
        System.out.println("Enter Two float values : ");
        float floatOne=in.nextFloat();
        float floatTwo=in.nextFloat();
        System.out.println("Float value is : "+over.multiply(floatOne,floatTwo));
        System.out.println("Enter Two integer values : ");
        int intOne=in.nextInt();
        int intTwo=in.nextInt();
        System.out.println("Integer value is : "+over.multiply(intOne,intTwo));
        System.out.println("Enter Two double value : ");
        double doubleOne=in.nextDouble();
        double doubleTwo=in.nextDouble();
        System.out.println("Double value is : "+over.multiply(doubleOne,doubleTwo));
    }
}
