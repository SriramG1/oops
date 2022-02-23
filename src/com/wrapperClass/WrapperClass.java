package com.wrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 50.5F;
        double d = 60.6D;
        char c = 'a';
        boolean b1 = true;

       // AutoBoxing
        Byte byteObj = b;
        Short shortObj = s;
        Integer intObj = i;
        Long longObj = l;
        Float floatObj = f;
        Double doubleObj = d;
        Character charObj = c;
        Boolean booleanObj = b1;

        //Display Objects
        System.out.println("Objects :");
        System.out.println("Byte Object      :"+byteObj);
        System.out.println("Short Object     :"+shortObj);
        System.out.println("Integer Object   :"+intObj);
        System.out.println("Long Object      :"+longObj);
        System.out.println("Float Object     :"+floatObj);
        System.out.println("Double Object    :"+doubleObj);
        System.out.println("Character Object :"+charObj);
        System.out.println("Boolean Object   :"+booleanObj);

        //Unboxing
        byte byteValue = byteObj;
        short shortValue = shortObj;
        int intValue = intObj;
        long longValue = longObj;
        float floatValue = floatObj;
        double doubleValue = doubleObj;
        char charValue = charObj;
        boolean booleanValue = booleanObj;

        //Display primitives
        System.out.println("Primitives     : ");
        System.out.println("Byte value    : "+byteValue);
        System.out.println("Short value   : "+shortValue);
        System.out.println("Int value     : "+intValue);
        System.out.println("Long value    : "+longValue);
        System.out.println("Float value   : "+floatValue);
        System.out.println("Double value  : "+doubleValue);
        System.out.println("Char value    : "+charValue);
        System.out.println("Boolean value : "+booleanValue);
    }
}
