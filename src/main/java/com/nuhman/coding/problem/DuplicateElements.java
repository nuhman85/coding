package com.nuhman.coding.problem;

//published youtube video

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

    //Find duplicate elements in a Stream

/*
    Set.add()
    Collectors.groupingBy
    Collections.frequency
*/

    public static Set<Integer> findDuplicate(List<Integer> list){
        Set<Integer> items = new HashSet<>();
        return list.stream()
                .filter(n-> !items.add(n))
                .collect(Collectors.toSet());
    }

    public static Set<Integer> findDuplicateByGroupBy(List<Integer> list){
        return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(m-> m.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }


    public static Set<Integer> findDuplicatesByFrequency(List<Integer> list){
        return list.stream()
                .filter(i-> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,4,5,2);
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicateByGroupBy(arr));
        System.out.println(findDuplicatesByFrequency(arr));
    }
}
