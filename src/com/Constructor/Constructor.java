package com.Constructor;

import java.util.Scanner;

class Constructor {
    float length;
    float breath;
    Constructor(float l,float b){
         length=l;
         breath=b;
    }
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
        System.out.println("Enter your Length :");
        float length=in.nextFloat();
        System.out.println("Enter Your Breath :");
        float breath=in.nextFloat();
        Constructor obj=new Constructor(length,breath);
    }
}
