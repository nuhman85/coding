package com.nuhman.coding.problem;

public class Counter {

    public static int[] maxCount(int n, int[] positions){
        int min=0, max=0;
        int[] resultArray =  new int[n];

        for(int i=0; i< positions.length; i++){
            if(positions[i]>=1 && positions[i]<=n){
                if(resultArray[positions[i]-1]< min){
                    resultArray[positions[i]-1] = min;
                }
                resultArray[positions[i]-1]++;

                if(resultArray[positions[i]-1]>max){
                    max = resultArray[positions[i]-1];
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
}
