package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {

    int i = 0;

    synchronized public void increment() {
        i++;
    }

    public int getI() {
        return i;
    }
}

class BiCounter {
    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();
    private int i = 0;
    private int j = 0;

    public void incrementI() {
        lockForI.lock();
        i++;
        lockForI.unlock();
    }

    public int getI() {
        return i;
    }

    synchronized public void incrementJ() {
        lockForJ.lock();
        i++;
        lockForJ.unlock();
    }

    public int getJ() {
        return j;
    }
}

public class ConcrencyRunner {

    public static void main(String[] args) {

        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        System.out.println(counter.getI());
    }
}
