package com.nuhman.coding.problem;

public class CountFactor {

    public static int findCountFactors(int num){
        int sqrt = (int) Math.sqrt(num);
        int numFactor = 0;
        for (int i = 1; i <= sqrt; i++) {
            if(num%i==0){
                numFactor++;
            }
        }

        numFactor = numFactor * 2;

        if(sqrt*sqrt == num){
            numFactor = numFactor - 1;
        }

        return numFactor;
    }

    public static void main(String[] args) {
        System.out.println(findCountFactors(24));
        System.out.println(findCountFactors(16));
        System.out.println(findCountFactors(20));

    }


}
