package com.nuhman.coding.problem;
//youtube published

public class FrogJump {

    public static int findNumberOfJumps(int x, int y, int d){ //10, 85, 30
        long difference = y - x; //75
        long plus =0;

        if(difference % d != 0) //75%30 = 15
            plus = 1;

        long hop=0;

        hop = difference/d; // 75/30 = 2

        hop = hop + plus; //2+1

        return (int)hop; //3
    }
    public static void main(String[] args){
        System.out.println(findNumberOfJumps(5,10, 2));
        System.out.println(findNumberOfJumps(6,10, 2));
    }
}
