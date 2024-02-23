package com.nuhman.coding.problem;

public class FrogJump {

    public static int findNumberOfJumps(int x, int y, int d){
        long difference = y - x;
        long plus =0;

        if(difference % d != 0)
            plus = 1;

        long hop=0;

        hop = difference/d;

        hop = hop + plus;

        return (int)hop;
    }
    public static void main(String[] args){
        System.out.println(findNumberOfJumps(5,10, 2));
        System.out.println(findNumberOfJumps(6,10, 2));
    }
}
