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
