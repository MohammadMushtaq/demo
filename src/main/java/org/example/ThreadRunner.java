package org.example;


class Task1 extends Thread {
    public void run() {
        for (int i = 100; i <= 199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Task 1 done");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        for (int i = 200; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Task 2 done");
    }
}

public class ThreadRunner {

    //Two ways to create Thread
    //extends Thread
    //implimenting thr Runnable

    public static void main(String[] args) {

        System.out.println("\n Task 1 kicked off");
        Task1 task1 = new Task1();
        task1.start();

        System.out.println("\n Task 2 kicked off");

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();
        task2Thread.setPriority(10);


        System.out.println("\n Task 3 kicked off");
        for (int i = 300; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n Task 3 done");
    }

}
