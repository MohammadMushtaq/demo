package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

    public static void main(String[] args) {
        Set<String> set = Set.of("apple", "grapes", "orange");
        System.out.println(set);

        HashSet<String> hashSet = new HashSet<String>(set);
        hashSet.add("kiwi");
        System.out.println(hashSet);


        Set<Integer> number = Set.of(32, 45, 11, 21, 88, 55);

        Set<Integer> linkedHashSets = new LinkedHashSet<>(number);
        System.out.println("linkedset " + linkedHashSets);
        TreeSet<Integer> treeSet = new TreeSet<>(Set.of(33, 22, 55, 45, 98));
        // treeSet.add(45);
        System.out.println("treeset " + treeSet);
        System.out.println(treeSet.floor(45));

        System.out.println(treeSet.lower(66));
        System.out.println(treeSet.subSet(22, 55));


    }
}
