package com.nuhman.coding.problem;

import java.util.Arrays;

public class DiscIntersect {

    public static int numberOfDiscs(int[] discRadius){

        long[] startIndex = new long[discRadius.length];
        long[] endIndex = new long[discRadius.length];

        for(int i=0; i<discRadius.length; i++){
            startIndex[i] = (long)i - discRadius[i];
            endIndex[i] = (long)i + discRadius[i];
        }
        System.out.println(Arrays.toString(startIndex));
        System.out.println(Arrays.toString(endIndex));

        Arrays.sort(startIndex);
        Arrays.sort(endIndex);

        System.out.println(Arrays.toString(startIndex));
        System.out.println(Arrays.toString(endIndex));

        int count = 0;
        int j = 0;


        for(int i=0; i<discRadius.length-1; i++){
            while(j<discRadius.length && endIndex[i]>=startIndex[j]){
                count +=j-i;
                j++;

                if(count>10000)
                    return -1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDiscs(new int[]{1, 5, 2, 1, 4, 0}));
    }
}
