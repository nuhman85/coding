package com.nuhman.coding.problem;

public class PerimeterTriangle {

    private static int findMinPerimeterTriangle(int n){
        int sqrt = (int) Math.sqrt(n);
        int perimeter = (1*2) + (n*2);
        System.out.println(perimeter);
        for (int i = sqrt; i > 0 ; i--) {
            if(n%i == 0){
                int a = i;
                int b = n/i;
                perimeter = (a * 2)+(b *2);
                break;
            }
        }
        return perimeter;
    }

    public static void main(String[] args) {
        System.out.println(findMinPerimeterTriangle(30));
    }
}
