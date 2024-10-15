package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(), value2.length());
    }
}

public class QueueRunner {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        //System.out.println(queue.poll());

        // queue.add("apple");
        queue.offer("banana");
        //System.out.println(queue.poll());
        queue.addAll(List.of("zebra", "cat", "lion"));
        //System.out.println(queue);
        //queue.poll();
        System.out.println(queue);


    }
}
