package com.nuhman.coding.problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PermutationCheck {
    public static int checkPermutation(int[] nums){
        Set<Integer> mySet = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        for(int i=0; i<nums.length;i++){
            if(!mySet.contains(i+1)){
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args){
        System.out.println(checkPermutation(new int[]{1,2,3,5,4}));
    }
}
