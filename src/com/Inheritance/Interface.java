package com.Inheritance;

class Phone{
    void call(){
        System.out.println("Calling is allowed");
    }
}

interface Camera{
    default void video(){
        System.out.println("Video recording allowed");
    }
    void photo();
}
interface Player{
    void play();
    void pause();
}

class SmartPhone extends Phone implements Camera,Player{
     public void video(){
        System.out.println("Video recording allowed");
    }

    @Override
    public void photo() {
        System.out.println("Photo capture allowed");
    }

    @Override
    public void play() {
        System.out.println("Music player allowed");
    }

    @Override
    public void pause() {
        System.out.println("pause music is allowed");
    }
}
public class Interface {
    public static void main(String[] args) {
        SmartPhone smartPhone= new SmartPhone();
        smartPhone.pause();
        smartPhone.play();
        smartPhone.video();
        smartPhone.call();
        smartPhone.photo();
    }
}
