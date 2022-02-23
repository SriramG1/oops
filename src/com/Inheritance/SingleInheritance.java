package com.Inheritance;

class TestOne{
    int base;
    void squareValue(int b){
        base=b;
        int answer=1;
        for(int i=0;i<2;i++){
            answer*=base;
        }
        System.out.println("Your answer is : "+answer);
    }
}
class TestTwo extends TestOne{
    void cubeValue(){
        int answer=1;
        for(int i=0;i<3;i++){
            answer*=base;
        }
        System.out.println("Your answer is : "+answer);
    }

}
public class SingleInheritance {
    public static void main(String[] args) {
        TestTwo obj = new TestTwo();
        obj.squareValue(3);
        obj.cubeValue();
    }
}
