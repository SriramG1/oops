package com.wrapperClass;

import java.util.*;

public class AutoBoxing {
    public static void integer(){
        ArrayList<Integer> integers=new ArrayList<>();
        integers.add(100);
        System.out.println(integers.get(0));
    }
    public static void character(){
        char letter='a';
        Character ch=letter; //Auto Boxing
        System.out.println(ch);
    }
    public static void floats(){
        float num=10.435f;
        Float obj2 = Float.valueOf(num);//Boxing
        System.out.println(obj2);
    }
    public static void main(String[] args) {
       character();
       integer();
       floats();
    }
}
