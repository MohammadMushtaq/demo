package org.example;

import java.util.Arrays;
import java.util.List;

public class ArrayExample {

    public static void main(String[] args) {

        int[] marks = {12, 323, 22};


        int sum = 0;
        for (int mark : marks) {
            sum = mark + sum;
        }
        System.out.println(sum);
//-------------------------------------------------------------
        int[] marks3 = new int[4];
        System.out.println(marks3[1]);
        marks3[3] = 10;
        System.out.println(marks3[3]);
//----------------------------------------------------------------
        int lenght = marks.length;
        System.out.println(lenght);
//-----------------------------------------------------------------
        int[] marks4 = {12, 323, 2, 3, 24, 5, 64, 22};
        for (int i = 0; i < marks4.length; i++) {
            System.out.print(marks4[i] + " ");
        }
        System.out.println();
        for (int mark : marks4) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(marks4));
        System.out.println("---");

//-----------------------------------------------------------------------------
        int[] sMarks = new int[5];
        Arrays.fill(sMarks, 100);
        System.out.println(Arrays.toString(sMarks));
//-------------------------------------------------------------------
        boolean eq = Arrays.equals(marks4, sMarks);
        System.out.println(eq);
//------------------------------------------------------------------
        Arrays.sort(marks4);
        System.out.println(Arrays.toString(marks4));

        System.out.println();
        String[] fruits = new String[4];
        fruits[0] = "grapes";
        fruits[1] = "mango";
        fruits[2] = "orange";
        fruits[3] = "kiwi";

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i] + " fruit");
        }

        System.out.println();

        for (String fru : fruits) {
            System.out.println(fru);
        }
        System.out.println();

        String[] veg = {"onion", "tomato", "carrot", "beans"};

        for (String vegy : veg) {
            System.out.println("vegy " + vegy);
        }

        List<String> listveg = Arrays.asList(veg);
        System.out.println();
        System.out.println(listveg);

        int[] number = {3, 2, 4, 43, 5};

        List<Integer> integerList = List.of(232, 32, 442, 42);

//        integerList.add(2);
//        integerList.add(3);
//        integerList.add(4);

        Object[] a = integerList.toArray();
        for (Object aa : a) {
            System.out.println(aa);
        }
    }
}
