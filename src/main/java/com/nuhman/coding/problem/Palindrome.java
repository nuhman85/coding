package com.nuhman.coding.problem;

//completed youtube video

public class Palindrome {
    //aba, aabb bbaa, aa, 11,121

    public static  boolean isPalindrome(String str){
        int length = str.length();
        //3 ; 1
        //4; 2

        for (int i = 0; i < length/2; i++) { // 1, 2
            if(str.charAt(i) != str.charAt(length-i-1)){ //i=0; 3    a0 a1 a2 a3     1; 4-1-1 2
                return false;
            }
        }

        return true;

    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("malayalams"));
    }
}
