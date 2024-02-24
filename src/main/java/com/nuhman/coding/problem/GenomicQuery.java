package com.nuhman.coding.problem;

import java.util.Arrays;
import java.util.Map;

public class GenomicQuery {

    public static int[] findGenomicValue(String s, int[] p, int[] q) {

        int[] result = new int[p.length];

        int A[] = new int[s.length()+1];
        int C[] = new int[s.length()+1];
        int G[] = new int[s.length()+1];
        int T[] = new int[s.length()+1];

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                A[i+1] = A[i]+1;
                C[i+1] = C[i];
                G[i+1] = G[i];
                T[i+1] = T[i];
            } else if(s.charAt(i) == 'C')
            {
                A[i+1] = A[i];
                C[i+1] = C[i]+1;
                G[i+1] = G[i];
                T[i+1] = T[i];
            }
            else if(s.charAt(i) == 'G')
            {
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i]+1;
                T[i+1] = T[i];
            }
            else if(s.charAt(i) == 'T')
            {
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i];
                T[i+1] = T[i]+1;
            }
        }

        int numOfQuery = p.length;

        for(int i=0; i< numOfQuery; i++){
            int a = A[q[i]+1] - A[p[i]];
            int c = C[q[i]+1] - C[p[i]];
            int g = G[q[i]+1] - G[p[i]];

            if(a>1){
                result[i] = 1;
            } else if(c > 0){ // there is 'c'
                result[i] = 2;
            }
            else if(g > 0){ // there is 'g'
                result[i] =3;
            }
            else{ // there is only 'T'
                result[i] =4;
            }
        }
        return result;

    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(findGenomicValue("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
    }
}
