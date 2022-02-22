package com.Constructor;


class Chaining{
    Chaining(){
        System.out.println("Chaining Constructor without argument is called");
    }
    Chaining(int number){
        System.out.println("Chaining Constructor with argument is called "+number);
    }
}
class Derived extends Chaining {
    Derived(){
        super(60);
        System.out.println("Derived Constructor without argument is called");
    }
    Derived(int number){
        System.out.println("Derived Constructor with argument is called "+number);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
       Derived obj = new Derived();
    }
}
