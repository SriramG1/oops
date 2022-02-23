package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TransientTwo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream out = new FileInputStream("C:\\Users\\sys\\Desktop\\FileHandlingJava\\testTwo.txt");
        ObjectInputStream object=new ObjectInputStream(out);
        User std = (User)object.readObject();
        System.out.println("Student name : "+std.userName+"\n"+"Student Number : "+std.password);
    }
}
