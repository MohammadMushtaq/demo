package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StudentArray {

    String name;
    int[] marks;

    StudentArray(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }


    public static void main(String[] args) {

        StudentArray studentArray = new StudentArray("mushtaq", 66, 78, 87, 90);
        StudentArray studentArray1 = new StudentArray("mutahir", 66, 78, 87, 90, 33);
        StudentArray studentArray2 = new StudentArray("Asif", 66, 78, 87, 90);


        int numberOfMarks = studentArray.getNumberOfMarks();
        System.out.println(numberOfMarks);
        System.out.println(studentArray.totalSumOfMarks());
        System.out.println(studentArray.maxMarks());
        System.out.println(studentArray.minMarks());
        System.out.println(studentArray.average());

    }

    public int getNumberOfMarks() {

        return marks.length;
    }

    public int totalSumOfMarks() {

        //return Arrays.stream(marks).sum();
        int sum = 0;
        for (int mark : marks) {
            sum = mark + sum;
        }
        return sum;
    }

    public int maxMarks() {
        // return Arrays.stream(marks).max();

        int maximum = Integer.MIN_VALUE;
        for (int mark : marks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }
        return maximum;
    }

    public int minMarks() {
        //return Arrays.stream(marks).min();

        int min = Integer.MAX_VALUE;
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    public BigDecimal average() {
        int sum = totalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }
}
