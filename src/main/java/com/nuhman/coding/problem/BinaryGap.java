package com.nuhman.coding.problem;
//youtube published https://www.youtube.com/watch?v=_agn-5PJI-o

public class BinaryGap {

    public static int findLargestBinaryGap(int N) {
        int maxCount = 0;
        int tempCount = 0;
        boolean prevOne = false;
        while (N != 0) {
            //System.out.println(N&1);
            if ((N & 1) == 0) {
                if(prevOne)
                    tempCount++;
            } else {
                prevOne = true;
                tempCount = 0;
            }
            N >>= 1;
            maxCount = Math.max(maxCount, tempCount);

        }
        return maxCount;
    }

    public static void main(String[] args) {
        //System.out.println(findLargestBinaryGap(14));
        System.out.println(findLargestBinaryGap(20));
        //System.out.println(Integer.toBinaryString(14));
        System.out.println(Integer.toBinaryString(20)); //10100
        System.out.println(Integer.toBinaryString(20 >> 1));

        System.out.println(findLargestBinaryGap(9));
        System.out.println(findLargestBinaryGap(529));
    }
}
