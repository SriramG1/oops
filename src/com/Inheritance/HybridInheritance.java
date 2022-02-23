package com.Inheritance;
class InheritOne{
    void one(){
        System.out.println("This is InheritOne");
    }
}
class InheritTwo extends InheritOne{
    void two(){
        System.out.println("This is InheritTwo");
    }
}
class InheritThree extends InheritOne{
    void three(){
        System.out.println("This is InheritThree");
    }
}
class InheritFour extends InheritTwo{
    void four(){
        System.out.println("This is InheritFour");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        InheritFour inheritFour= new InheritFour();
        inheritFour.four();
        inheritFour.two();
        inheritFour.one();

    }
}
