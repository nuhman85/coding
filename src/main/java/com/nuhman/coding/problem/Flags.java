package com.nuhman.coding.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flags {

    public static List<Integer> findNumberOfMountatinPeaks(int[] flags){
        List<Integer> peaks = new ArrayList<>();
        for (int i = 0; i < flags.length; i++) {
            boolean leftExist = i-1>=0;
            boolean rightExist = i+1<flags.length;

            if(leftExist && rightExist && flags[i]>flags[i-1] && flags[i]> flags[i+1]){
                peaks.add(i);
            }
        }

        return peaks;
    }

    public static int setFlags(List<Integer> peaks, int totalFlags){
        int flagSet = 1;
        int lastFlagIndex = peaks.get(0);

        for (int i = 1; i < peaks.size(); i++) {
            int currIndex = peaks.get(i);
            if(currIndex - lastFlagIndex >= totalFlags){
                flagSet++;
                lastFlagIndex = currIndex;
            }

            if(totalFlags == flagSet){
                return flagSet;
            }
        }
        return flagSet;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{1,5,3,4,3,4,1,2,3,4,6,2};
        List<Integer> peaksIndexList = findNumberOfMountatinPeaks(testArray);
        int maxFlags = (int)Math.ceil(Math.sqrt(testArray.length));
        int setFlags = setFlags(peaksIndexList, maxFlags);
        System.out.println(setFlags);

        //finding peaks
        testArray = new int[]{1,2,3,4,3,4,1,2,3,4,6,2};
        peaksIndexList = findNumberOfMountatinPeaks(testArray);
        peaksIndexList.forEach(System.out::println);
    }
}
