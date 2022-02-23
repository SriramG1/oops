package com.wrapperClass;

import java.util.ArrayList;

public class AutoUnboxing {
    public static void character(){
        char character='b';
        Character obj =(character);
        char characterTwo=obj;
        System.out.println(characterTwo);
    }
    public static void integer(){
        ArrayList<Integer> obj1 = new ArrayList<>();
        obj1.add(100);
        int value= obj1.get(0);
        System.out.println(value);
    }
    public static void floats(){
        float num=10.435f;
        Float obj2 = Float.valueOf(num);
        float num2=obj2.floatValue();
        System.out.println(num2);
    }
    public static void main(String[] args) {
        character();
        integer();
        floats();
    }
}
