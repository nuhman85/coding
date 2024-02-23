package com.nuhman.coding.problem;

public class BinaryGap {

    public static int findLargestBinaryGap(int N){
       int maxCount = 0;
       int tempCount = 0;

       while(N != 0){
           if((N & 1) == 0) {
               tempCount++;
               N >>= 1;
               maxCount = Math.max(maxCount, tempCount);
           } else {
               maxCount=Math.max(maxCount, tempCount);
               tempCount = 0;
               N >>= 1;
           }

       }
       return maxCount;
    }

    public static void main(String[] args){
        System.out.println(findLargestBinaryGap(14));
        System.out.println(findLargestBinaryGap(20));
        System.out.println(Integer.toBinaryString(14));
        System.out.println(Integer.toBinaryString(20));
        System.out.println(Integer.toBinaryString(20>>1));
    }
}
