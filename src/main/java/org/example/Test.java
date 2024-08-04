package org.example;

public class Test {
    public static void main(String[] args){

        Test test= new Test();
        test.loop(3);
    }
    public void loop(int i){
        if(i<10) {
            for (i = 2; i < 10; i++) {
                System.out.println("hello world");
            }
    }
        else{
        System.out.println("invalid value");
        }
    }
}
