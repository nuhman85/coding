package com.nuhman.coding.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//published youtube
public class CountNonDivisible {

    public static int[] findCountNonDivisible(int[] nums){
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int count = 1;
            if (map1.containsKey(nums[i])){
                count = map1.get(nums[i])+1;
            }
            map1.put(nums[i], count);
        }

        Map<Integer, Integer> map2 = new HashMap<>();

        for(int n: map1.keySet()){
            int numDivisors = 0;
            int sqrtN = (int) Math.sqrt(n);
            for (int i = 1; i <= sqrtN ; i++) { //36 1, 2, 3, 4, 6,  9, 12,  18,  36,   1 >> 2 >> 3 >> 4 >> 6       6
                if(n%i==0){
                    int anotherDivisor = n/i; //36/3 12

                    if(map1.containsKey(i)){
                        numDivisors = numDivisors + map1.get(i);
                    }
                    if(anotherDivisor !=i){  //12!=3
                        if(map1.containsKey(anotherDivisor)) {
                            numDivisors = numDivisors + map1.get(anotherDivisor);
                        }
                    }
                }
                
            }
            int numNonDivisors = nums.length - numDivisors;
            map2.put(n, numNonDivisors);
        }

        int[] results  = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            results[i] = map2.get(nums[i]);
        }

        return results;
    }

    public static void main(String[] args) {
        System.out.println("Input: "+Arrays.toString(new int[]{3,1,2,3,6}));
        System.out.println("Output: "+Arrays.toString(findCountNonDivisible(new int[]{3,1,2,3,6})));
    }
}
