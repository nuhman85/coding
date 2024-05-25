package com.nuhman.coding.problem;
//published youtube
public class LongestPalindromeSubstring {

    public static String stringFromOneLoop(int low, int high, String str) {
        while (str.charAt(low) == str.charAt(high)) { //aba
            low--;
            high++;

            if (low == -1 || high == str.length())
                break;
        }

        return str.substring(low + 1, high);
    }

    public static String longestPalindrome(String string) {
        if (string.length() <= 1) {
            return string;
        }

        String largestP = "";

        for (int i = 1; i < string.length(); i++) {
            //odd example aba
            int low = i;
            int high = i;

            String findPalindrome = stringFromOneLoop(low, high, string);
            largestP = findPalindrome.length() > largestP.length() ? findPalindrome : largestP;

            //even length aabb
            low = i - 1;
            high = i;

            findPalindrome = stringFromOneLoop(low, high, string);
            largestP = findPalindrome.length() > largestP.length() ? findPalindrome : largestP;

        }
        return largestP;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("malayalam")); //for n * while 2(n/2) = O(n2)
        System.out.println(longestPalindrome("ebbabad"));
    }


}
