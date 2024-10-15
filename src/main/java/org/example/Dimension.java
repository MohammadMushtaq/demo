package org.example;

public class Dimension {
    private int feet;
    private int inches;

    public Dimension(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
        if (inches < 0) {
            this.feet = -1;
            this.inches = -1;
        } else {
            this.feet = inches / 12;
            this.inches = inches % 12;
        }
    }

    public static void main(String[] args) {

        int inputInches = 29;

        // Create a Dimension object with the given inches
        Dimension d = new Dimension(inputInches);

        // Output the result in the desired format
        System.out.println(inputInches + " inch = " + d.getFeet() + " Foot " + d.getInches() + " inch");

    }

    public int getFeet() {
        // TODO: Return the value of feet.
        return feet;
    }

    public int getInches() {
        // TODO: Return the value of inches.
        return inches;
    }
}