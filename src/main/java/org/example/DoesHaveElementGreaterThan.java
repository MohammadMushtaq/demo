package org.example;

public class DoesHaveElementGreaterThan {

    public static void main(String[] args) {
        DoesHaveElementGreaterThan d = new DoesHaveElementGreaterThan();
        boolean v = d.doesHaveElementGreaterThan(new int[]{1, 2, 3, 4, 5}, 10);
        System.out.println(v);
    }

    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        for (int num : array) {
            if (number > num)
                return true;
        }
        return false;
    }
}
