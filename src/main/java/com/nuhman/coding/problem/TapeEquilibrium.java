package com.nuhman.coding.problem;

public class TapeEquilibrium {

    public static int minimumDifferenceArray(int[] num){
        int sum = 0;
        int minDifference  = Integer.MAX_VALUE;

        for(int n: num)
            sum +=n;

        int sumPartOne = 0;
        int sumPartTwo = 0;
        int diff = 0;

        for(int p=1; p<num.length; p++){
            sumPartOne = sumPartOne + num[p];
            sumPartTwo = sum - sumPartOne;
            diff = Math.abs(sumPartOne-sumPartTwo);
            minDifference = Math.min(minDifference, diff);

        }

        return minDifference;
    }


    public static void main(String[] args){
        System.out.println(minimumDifferenceArray(new int[]{3, 1, 2, 4, 3}));
    }
}
