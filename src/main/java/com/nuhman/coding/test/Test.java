package com.nuhman.coding.test;

import java.util.*;

public class Test {

    public static void getDuplicateValueWithIndex(int[] num){
        Set<Integer> numbers = new HashSet<>();
        Map<Integer, List<Integer>> result = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            if(numbers.contains(num[i])){
                List<Integer> resArray = new ArrayList<>();
                if(result.containsKey(num[i])){
                    resArray = result.get(num[i]);
                }
                resArray.add(i);
                result.put(num[i], resArray);
            } else{
                numbers.add(num[i]);
            }
        }

        Object[][] arr =
                result.entrySet().stream()
                        .map(e -> new Object[]{e.getKey(), e.getValue()})
                        .toArray(Object[][]::new);
        System.out.println(Arrays.deepToString(arr));

    }

    public static void main(String[] args) {

    }
}
