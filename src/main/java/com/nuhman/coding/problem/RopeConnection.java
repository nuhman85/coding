package com.nuhman.coding.problem;

import java.util.PriorityQueue;

public class RopeConnection {

    public static int minCost(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        int res=0;

        while(pq.size()>1){
            int first = pq.poll();
            int second=pq.poll();

            res += first + second;
            pq.add(first+second);
        }
        return res;
    }
    public static void main(String[] args){

        System.out.println(minCost(new int[]{4, 3, 2, 6}));
    }
}
