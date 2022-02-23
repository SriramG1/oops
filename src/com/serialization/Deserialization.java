package com.serialization;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream out = new FileInputStream("C:\\Users\\sys\\Desktop\\FileHandlingJava\\test.txt");
        ObjectInputStream object=new ObjectInputStream(out);
        Student std = (Student)object.readObject();
        System.out.println("Student name : "+std.name+"\n"+"Student Number : "+std.number);
    }
}
