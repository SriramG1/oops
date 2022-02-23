package com.polymorphism;
class OverRiding{
    void methodOne(){
        System.out.println("This is method one from Class OverRiding");
    }
    void methodTwo(){
        System.out.println("This is method Two  from Class OverRiding");
    }
}
class OverRidingTwo extends OverRiding{
    @Override
    void methodOne() {
        System.out.println("After OverRide : This is method one From Class OverRiding Two");
    }

    @Override
    void methodTwo() {
        System.out.println("After OverRide : This is method two From Class OverRiding Two");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {

        OverRidingTwo overRidingTwo=new OverRidingTwo();
        overRidingTwo.methodOne();
        overRidingTwo.methodTwo();

        OverRiding overRiding = new OverRiding();
        overRiding.methodOne();
        overRiding.methodTwo();
    }
}
