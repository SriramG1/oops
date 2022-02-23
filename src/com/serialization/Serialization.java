package com.serialization;

import java.io.*;

class Student implements Serializable{
    String name;
    int number;
    Student(String str,int num){
        name=str;
        number=num;
    }
}
public class Serialization {
    public static void main(String[] args) throws IOException {
        Student std= new Student("Sriram",9527);
        FileOutputStream file=new FileOutputStream("C:\\Users\\sys\\Desktop\\FileHandlingJava\\test.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(std);
        out.flush();
        out.close();
    }
}
