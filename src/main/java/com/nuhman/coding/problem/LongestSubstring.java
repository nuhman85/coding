package com.nuhman.coding.problem;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int findLongestSubString(String str){
        if(str.length() == 0)
            return 0;
        int longest = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            Set<Character> hashSet = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                if(hashSet.contains(str.charAt(j))){
                    longest = Math.max(longest, j-i);
                    break;
                }
                hashSet.add(str.charAt(j));
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(findLongestSubString("abcabcbb"));
    }
}
