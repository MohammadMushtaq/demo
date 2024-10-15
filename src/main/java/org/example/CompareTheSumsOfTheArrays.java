package org.example;

public class CompareTheSumsOfTheArrays {

    private int[] array1;
    private int[] array2;

    public CompareTheSumsOfTheArrays(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public static void main(String[] args) {
        CompareTheSumsOfTheArrays c = new CompareTheSumsOfTheArrays(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
        System.out.println(c.calculateSum(new int[]{1, 2, 3, 4}));
        System.out.println(c.areSumsEqual());
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        // TODO: Write the code to compare the sums of the arrays and return the result.
        if (sum1 == sum2) {
            return true;
        }
        return false;

    }

    private int calculateSum(int[] array) {

        int sum = 0;
        for (int sort : array) {
            sum = sort + sum;
        }
        return sum;
    }
}
