package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {

    String name;
    ArrayList<Integer> marks = new ArrayList<Integer>();

    StudentArrayList(String name, int... marks) {
        this.name = name;
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }


    public static void main(String[] args) {

        StudentArrayList studentArray = new StudentArrayList("mushtaq", 66, 78, 87, 90);
        StudentArrayList studentArray1 = new StudentArrayList("mutahir", 66, 78, 87, 90, 33);
        StudentArrayList studentArray2 = new StudentArrayList("Asif", 66, 78, 87, 90);


        int numberOfMarks = studentArray.getNumberOfMarks();
        System.out.println("no of marks " + numberOfMarks);
        System.out.println("total Marks " + studentArray.totalSumOfMarks());
        System.out.println("max marks " + studentArray.maxMarks());
        System.out.println("min marks " + studentArray.minMarks());
        System.out.println("Average marks " + studentArray.average());

        System.out.println(studentArray);

        studentArray.addNewMark(44);
        System.out.println(studentArray);

        studentArray.removeMarkAtIndex(3);
        System.out.println(studentArray);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }

    public void addNewMark(int mark) {
        marks.add(mark);
    }

    public int getNumberOfMarks() {

        return marks.size();
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

       /* int maximum = Integer.MIN_VALUE;
        for (int mark : marks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }*/

        return Collections.max(marks);
    }

    public int minMarks() {
        //return Arrays.stream(marks).min();

       /* int min = Integer.MAX_VALUE;
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }*/
        return Collections.min(marks);
    }

    public BigDecimal average() {
        int sum = totalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

    }

    @Override
    public String toString() {
        return "StudentArrayList{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
