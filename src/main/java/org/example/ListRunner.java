package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListRunner {

    public static void main(String[] args) {


        List<Integer> integerList = List.of(232, 32, 442, 42);
        System.out.println(integerList);

        List<Integer> arrayList = new ArrayList<>(integerList);
        System.out.println(arrayList);

        List<Integer> listLinked = new LinkedList<>(integerList);
        System.out.println(listLinked);

        List<Integer> listVector = new Vector<>(integerList);
        System.out.println(listVector);

        arrayList.add(33);

        System.out.println(arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("cat");
        arrayList1.add("two");
        System.out.println(arrayList1);

        arrayList1.set(1, "bat");
        System.out.println(arrayList1);

        arrayList1.add(2, "rit");
        System.out.println(arrayList1);

        for (String list : arrayList1) {
            if (list.endsWith("at")) {
                System.out.println(list);
            }
        }

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().endsWith("at")) {
                iterator.remove();
            }
        }
    }

    public static class SortList {

        public static void main(String[] args) {

            List<Integer> number = List.of(44, 33, 55, 22, 79);

            ArrayList<Integer> integers = new ArrayList<>(number);
            Collections.sort(integers);
            System.out.println(integers);


        }
    }
}
