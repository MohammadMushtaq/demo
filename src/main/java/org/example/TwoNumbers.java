package org.example;

import java.util.Arrays;

public class TwoNumbers {

    public static void main(String[] args) {
        int[] number ={2,1,11,15,7};
        int target=9;
       int result[] = solution(number,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] number , int target){

//        HashMap<Integer,Integer> index = new HashMap<>();
//
//        for (int i=0; i<number.length; i++){
//            Integer reqNum = target-number[i];
//
//            if(index.containsKey(reqNum)){
//                int toReturn[] = {index.get(reqNum),i};
//                return toReturn;
//            }
//            index.put(number[i],i);
//        }
//        return null;

        for (int i = 0; i < number.length-1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == target) {
                    int res = number[i]+number[j];
                    System.out.println(number[i]+ " + " +number[j] +" = "+res);
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
