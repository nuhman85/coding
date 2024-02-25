package com.nuhman.coding.problem;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public static int findDominatorFromArray(int[] nums){
        Map<Integer, Integer> itemCount = new HashMap<>();

        for(int i: nums){
            int count = 0;
            if(itemCount.containsKey(i)){
                count = itemCount.get(i);
            }
            itemCount.put(i, count+1);
        }

        int maxKey = Collections.max(itemCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        int maxValue = itemCount.get(maxKey);

        if(maxValue<=nums.length/2){
            return -1;
        }

        for(int i=0; i< nums.length;i++){
            if(nums[i] == maxKey){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findDominatorFromArray(new int[]{3,2,3,4,3,3,3,-1}));
    }
}
