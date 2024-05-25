package com.nuhman.coding.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findIndicesOfTargetSum(int [] nums, int target){
        if(nums == null || nums.length == 0){
            return new int[] {-1, -1};
        }
        Map<Integer, Integer> visited = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int difference = target - nums[i];
            if(visited.containsKey(difference)){
                return new int[] {i, visited.get(difference)};
            }
            visited.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIndicesOfTargetSum(new int[]{2,6,4,5,7}, 8)));
        System.out.println(Arrays.toString(findIndicesOfTargetSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(findIndicesOfTargetSum(new int[]{2,3,4}, 6)));
    }
}
