package org.example;

import java.util.Arrays;

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

    }
}
