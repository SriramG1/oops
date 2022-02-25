package com.Constructor;
class NewClass{
    int id;
    String name;
    public NewClass(String s,int n){
        id=n;
        name=s;
    }
    public NewClass(NewClass a){
        id=a.id;
        name=a.name;
    }
    public void display(){
        System.out.println("Name of your student : "+name);
        System.out.println("Id of your student   : "+id);
    }
}
public class CopyConstructors {
    public static void main(String[] args) {
        NewClass newClass = new NewClass("Sriram",9527);
        NewClass newClassOne = new NewClass(newClass);
        newClass.display();
        newClassOne.display();
    }
}
