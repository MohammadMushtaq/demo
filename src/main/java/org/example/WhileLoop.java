package org.example;

public class WhileLoop {

    int num;

    public WhileLoop(int number) {
        this.num = number;
    }

    public static void main(String[] args) {

        WhileLoop whileLoop = new WhileLoop(30);
        whileLoop.printSquareUptoLimit();
        System.out.println("____________");
        whileLoop.printCubeUptoLimit();
        System.out.println("____________");
        
        int a = 1;
        while (a < 30) {
            System.out.println(a);
            a++;
        }

    }

    public void printSquareUptoLimit() {
        int i = 1;
        while (i * i < num) {
            System.out.println(i * i);
            i++;
        }
    }

    public void printCubeUptoLimit() {
        int i = 1;
        while (i * i * i <= num) {
            System.out.println(i * (i * i));
            i++;
        }
    }


}
