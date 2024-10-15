package org.example;

import java.util.TreeMap;

public class TreeMapRunner {

    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("Z", 100);
        treeMap.put("B", 2);
        treeMap.put("F", 6);

        System.out.println(treeMap);
        System.out.println(treeMap.higherKey("B"));
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
}
