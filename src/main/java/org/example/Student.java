package org.example;

public class Student {

    int marks;

    public Student(int marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student student = new Student(45);
        System.out.println(student.assignGrades());
    }

    public char assignGrades() {
        if (marks > 100 || marks < 0) {
            return 'X';
        } else if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else if (marks >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
}
