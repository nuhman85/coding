package com.nuhman.coding.problem;


import java.util.HashMap;
import java.util.Map;

class LargestPalindrome {
    public Map<Integer, Integer> test = new HashMap<>();

    public static int longestPalindrome(String s) {
        String R
                = new StringBuilder(s).reverse().toString();

        // dp[i][j] will store the length of the longest
        // palindromic subsequence for the substring
        // starting at index i and ending at index j
        int dp[][]
                = new int[s.length() + 1][R.length() + 1];

        // Filling up DP table based on conditions discussed
        // in above approach
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= R.length(); j++) {
                if (s.charAt(i - 1) == R.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i][j - 1],
                            dp[i - 1][j]);
            }
        }

        // At the end DP table will contain the LPS
        // So just return the length of LPS
        return dp[s.length()][R.length()];
    }


    public static void main(String args[]) {
        // Your code goes here
        String s = "Hello";
        System.out.println(longestPalindrome(s));
    }
}

