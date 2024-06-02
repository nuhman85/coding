package com.nuhman.coding.test;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public class AppUtils {

    public static void testStringNulls (String str) {
        //String str2 = str;
        //String str2 = Objects.requireNonNull(str);

    //String str2 = Objects.requireNonNull(str, "So you need to supply non null values");
        //String str2 = Objects.requireNonNullElse(str, "Hi, I am a Default string");
        Supplier<String> strSupplier = ()-> LocalDate.now().toString();
        //String str2 = Objects.requireNonNullElseGet(str, strSupplier);
        //String str2 = Objects.requireNonNullElseGet(str, ()-> LocalDate.now().toString());

        String str2 = Optional.ofNullable(str).orElse("nonNull");
        System.out.println(str2);
    }


    public static void main(String[] args) {
        testStringNulls(null);
    }
}
