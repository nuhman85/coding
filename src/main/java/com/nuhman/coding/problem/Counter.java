package com.nuhman.coding.problem;

import java.util.Arrays;

//youtube published https://www.youtube.com/watch?v=gsFhaxZGwyM

public class Counter {

    public static int[] maxCount(int n, int[] positions){ //3,4,4,6, etc
        int min=0, max=0;
        int[] resultArray =  new int[n];

        for(int i=0; i< positions.length; i++){
            if(positions[i]>=1 && positions[i]<=n){ //3
                if(resultArray[positions[i]-1]< min){ //2 //0
                    resultArray[positions[i]-1] = min;
                }
                resultArray[positions[i]-1]++; //1

                if(resultArray[positions[i]-1]>max){
                    max = resultArray[positions[i]-1]; //1
                }
            }else if(positions[i] == n+1){
                min = max;
            }
        }

        for(int i=0; i< resultArray.length; i++){
            if(resultArray[i]<min){
                resultArray[i] = min;
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxCount(5, new int[]{3,4,4,6,1,4,4})));
    }
}
