package com.nuhman.coding.problem;

import java.util.Arrays;

public class CyclicRotation {
    public static int[] rotateArray(int[] arr, int k){
        int[] newArray = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            int newPosition = (i + k) % arr.length;
            newArray[newPosition] = arr[i];
        }
        return newArray;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(rotateArray(new int[]{2,3,4,5}, 2)));
    }
}
