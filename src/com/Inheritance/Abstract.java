package com.Inheritance;

abstract class Mobile{
    void call(){
        System.out.println("Voice calling");
    }
    void fingerPrint(){
        System.out.println("Finger Print allowed");
    }
    abstract void camera();
    abstract void displaySize();
}
abstract class Samsung extends Mobile{

    @Override
    void camera() {
        System.out.println("13 mp Camera in samsung");
    }

//    @Override
//    void displaySize() {
//        System.out.println("5'5 inch display in samsung");
//    }
}
class Nokia extends Samsung{

    @Override
    void camera() {
        System.out.println("20 mp camera in nokia");
    }

    @Override
    void displaySize() {
        System.out.println("6'0 inches display in nokia");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Nokia modelOne = new Nokia();
        modelOne.camera();
    }
}
