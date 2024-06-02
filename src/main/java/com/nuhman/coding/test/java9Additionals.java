package com.nuhman.coding.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class java9Additionals {

    public static void objectsClassModificationsInJava9 (List<String> stringList) {

        //The new methods in Java 9
        //1 . requireNonNullElse method
        List<String> strList = Objects.requireNonNullElse(stringList, Collections.EMPTY_LIST);
        System.out.println(strList);

        //2 . requireNonNullElseGet method
        strList = Objects.requireNonNullElseGet(stringList, List::of);
        System.out.println(strList);

        //3 . checkIndex method
        int checkIndex = Objects.checkIndex(strList.size(), 1);
        System.out.println(checkIndex);
        //replaces if(strList.size()==1) throws exception

        //4 . checkFromToIndex method
        int startIndex = 0;
        int endIndex = 1;
        checkIndex = Objects.checkFromToIndex(startIndex, endIndex, 1);
        System.out.println(checkIndex);

        //5 . checkFromIndexSize method
        startIndex = 2;
        endIndex = 4;
        checkIndex = Objects.checkFromIndexSize(startIndex, endIndex, 6);
        System.out.println(checkIndex);



    }

    public static void main(String[] args) {
        objectsClassModificationsInJava9(null);
        objectsClassModificationsInJava9(Arrays.asList("str", "str2"));
    }

}
