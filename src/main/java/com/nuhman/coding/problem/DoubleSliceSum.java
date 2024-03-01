package com.nuhman.coding.problem;

public class DoubleSliceSum {
    public static int maximumDoubleSliceSum(int[] arr){
        int[] maxLeft = new int[arr.length];
        int[] maxRight  = new int[arr.length];

        System.out.print("maxLeft: ");
        for(int i=1;i<arr.length; i++){

            maxLeft[i] = Math.max(0, maxLeft[i-1]+arr[i]);
            System.out.print(maxLeft[i]);
        }
        System.out.println("");
        System.out.print("maxRight: ");
        for (int i = arr.length -2; i >=0; i--) {
            maxRight[i] = Math.max(0, maxRight[i+1]+arr[i]);
            System.out.print(maxRight[i]);
        }

        int maxDoubleSize = 0;

        for (int i = 1; i < arr.length -1; i++) {
            if(maxLeft[i-1] + maxRight[i+1] > maxDoubleSize){
                maxDoubleSize = maxLeft[i-1] +maxRight[i+1];
            }
        }
        return maxDoubleSize;

    }

    public static void main(String[] args) {
        System.out.println(maximumDoubleSliceSum(new int[]{3, 2, 6, -1, 4, 5, -1, 2}));

    }
}
