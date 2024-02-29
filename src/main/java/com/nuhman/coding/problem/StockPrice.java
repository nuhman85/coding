package com.nuhman.coding.problem;

public class StockPrice {

    public static int findMaximumProfit(int[] stockPrice){
        if(stockPrice.length == 0)
            return 0;

        int minimumPrice = stockPrice[0];
        int maximumProfit = 0;

        for(int i=1; i< stockPrice.length; i++){
            if(stockPrice[i]<minimumPrice){
                minimumPrice = stockPrice[i];
            } else {
                int curPrice = stockPrice[i] - minimumPrice;
                if(curPrice>maximumProfit){
                    maximumProfit = curPrice;
                }
            }
        }
        return maximumProfit;
    }

    public static void main(String[] args) {
        System.out.println(findMaximumProfit(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }
}
