package com.nuhman.coding.problem;

public class ArraySliceSum {

    public static int findSliceSum(int[] array){
        int r = array[0];
        int t = array[0];
        int n = array.length;

        for(int i=1;i<n; i++){
            t = Math.max(array[i], t + array[i]);
            System.out.println("t:"+t);
            r = Math.max(r, t);
            System.out.println("r:"+r);

        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(findSliceSum(new int[]{3, 2, -6, 4, 0, 7}));
    }
}
