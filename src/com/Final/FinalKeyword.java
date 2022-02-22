package com.Final;

class Employers{
    String name;
    final String GENDER;
    final int AGE;
    Employers(String name,String gender,int age){
        System.out.println(this.name);
        System.out.println(name);
        this.name=name;
        GENDER=gender;
        AGE=age;
    }
//    Employers(String name,String gender){
//        name=name;
//        GENDER=gender;
//    }
    void details(){
        System.out.println("Name    : "+ name);
        System.out.println("Gender  : "+ GENDER);
        System.out.println("Age     : "+ AGE);
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        Employers object = new Employers("Sriram","male",21);
       // object.name="ram";
        //obj.AGE=26;
        object.details();
    }
}
