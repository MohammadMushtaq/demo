package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {

    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("A", 1, "c", 4, "b", 3);
        System.out.println("map " + map);

        System.out.println(map.get("A"));
        System.out.println(map.containsKey("b"));
        System.out.println(map.containsValue(5));
        System.out.println(map.keySet());
        System.out.println(map.values());

        Map<String, Integer> map1 = Map.of("a", 1, "c", 4, "b", 3, "d", 5);

        Map<String, Integer> hashMap = new HashMap<>(map1);
        System.out.println(hashMap.put("r", 9));
        System.out.println("hashMap1 " + hashMap);
        System.out.println(hashMap.put("r", 10));
        System.out.println("hashMap2 " + hashMap);
        System.out.println(hashMap.put("r", 9));
        System.out.println("hashMap3 " + hashMap);

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 3);
        linkedHashMap.put("G", 2);
        linkedHashMap.put("R", 4);
        linkedHashMap.put("E", 9);
        System.out.println("LinkedHashMap " + linkedHashMap);

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("R", 3);
        treeMap.put("A", 4);
        treeMap.put("A", 5);
        treeMap.put("B", 7);
        treeMap.put("F", 1);
        System.out.println(treeMap);

        String str = "this is an awesome occasion." +
                "this has never is happened before.";

        Map<Character, Integer> occurances = new HashMap<>();

        char[] characters = str.toCharArray();
        for (char character : characters) {
            Integer integer = occurances.get(character);
            if (integer == null) {
                occurances.put(character, 1);
            } else {
                occurances.put(character, integer + 1);
            }
        }
        System.out.println(occurances);


        Map<String, Integer> stringOccurances = new HashMap<>();
        String[] words = str.split(" ");

        for (String word : words) {
            Integer integer = stringOccurances.get(word);
            if (integer == null) {
                stringOccurances.put(word, 1);
            } else {
                stringOccurances.put(word, integer + 1);
            }
        }
        System.out.println(stringOccurances);

    }
}
