package com.nuhman.coding.test;

import java.util.*;

public class TestClass3 extends TestClass2 {
    @Override
    public void bark() {
        super.bark();
        System.out.println("test class 3 to");
    }


    public static void main(String[] args) {
        TestClass2 testClass2 = new TestClass3();
        testClass2.bark();

        // Creating a list of Strings
        List<String> list = Arrays.asList("3", "6", "8",
                "14", "15");

        // Using Stream mapToInt(ToIntFunction mapper)
        // and displaying the corresponding IntStream
        int sum = list.stream().mapToInt(i -> Integer.parseInt(i))
                .map(num->num*2).reduce(0, (x,y)->x+y);
        System.out.println(sum);


        Map<String, Integer> mapCountryCode = new HashMap<>();

        mapCountryCode.put("USA", 1);
        mapCountryCode.put("Canada", 1);
        mapCountryCode.put("Brazil", 55);
        mapCountryCode.put("Australia", 61);


        //Using Iterator and Mao.Entry
        Iterator<Map.Entry<String, Integer>> it = mapCountryCode.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<String,Integer> value = it.next();
            System.out.println("Key:"+value.getKey()+", Value:"+value.getValue());
        }

        //java 10
        var its = mapCountryCode.entrySet().iterator();

        while(its.hasNext()){
            var value = its.next();
            System.out.println("Key:"+value.getKey()+", Value:"+value.getValue());
        }


        //using foreach and Map.Entry
        for (Map.Entry<String, Integer> pair: mapCountryCode.entrySet()){
            System.out.println("Key:"+pair.getKey()+", Value:"+pair.getValue());
        }
        //java 10
        for (var pair: mapCountryCode.entrySet()){
            System.out.println("Key:"+pair.getKey()+", Value:"+pair.getValue());
        }

        //Using foreach from java 8
        mapCountryCode.forEach((k, v)-> System.out.println("Key:"+k+", Value:"+v));


        //4. Using keySet
        for(String keys: mapCountryCode.keySet()){
            System.out.println("Key:"+keys+", Value:"+mapCountryCode.get(keys));
        }

        //java 8 ways of keyset
        mapCountryCode.keySet().forEach(v-> System.out.println("Key:"+v+", Value:"+mapCountryCode.get(v)));


        //keyset and iterator

        Iterator<String> itse = mapCountryCode.keySet().iterator();

        while(itse.hasNext()){
            String value = itse.next();
            System.out.println("Key:"+value+", Value:"+mapCountryCode.get(value));
        }






    }
}
