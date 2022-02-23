package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class User implements Serializable {
    String userName;
    transient String password;
    User(String n,String pwd){
        userName=n;
        password=pwd;
    }
}
public class Transient {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your user name : ");
        String name=in.nextLine();
        System.out.println("Enter Your user password : ");
        String password=in.nextLine();
        User user= new User(name,password);
        FileOutputStream file=new FileOutputStream("C:\\Users\\sys\\Desktop\\FileHandlingJava\\testTwo.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(user);
        out.flush();
        out.close();
    }
}
