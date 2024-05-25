package com.nuhman.coding.problem;

//youtube published

public class ArraySliceSum {

    public static int findSliceSum(int[] array){
        int largestSum = array[0];
        int rowMax = array[0];
        int n = array.length;

        for(int i=1;i<n; i++){
            rowMax = Math.max(array[i], rowMax + array[i]);
            //System.out.println("t:"+rowMax);
            largestSum = Math.max(largestSum, rowMax);
            //System.out.println("r:"+largestSum);

        }
        return largestSum;
    }

    public static void main(String[] args) {
        System.out.println(findSliceSum(new int[]{3, 2, -6, 4, 0, 7}));
        System.out.println(findSliceSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(findSliceSum(new int[]{5,4,-1,7,8}));
    }
}
