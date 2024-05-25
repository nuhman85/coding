package com.nuhman.coding.problem;

import java.util.HashSet;
import java.util.Set;
//youtube published
public class FrogRiverJump {
    public static int findFrogJumpTime(int[] nums, int x){//5 1, 3, 1, 4, 2, 3, 5, 4
        Set<Integer> sets = new HashSet<>();
        for(int y=0; y< x; y++)
            sets.add(y+1); //1,2,3,4,5
        for(int i=0; i<nums.length;i++){ //0, 1, 2, 3, 4, 5, 6=5, 4  //,,,,
            if(sets.contains(nums[i])){
                sets.remove(nums[i]); //
            }
            if(sets.isEmpty()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(findFrogJumpTime(new int[]{1, 3, 1, 4, 2, 3, 5, 4}, 5));
    }
}
