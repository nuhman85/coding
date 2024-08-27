package com.nuhman.coding.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerProducerTesting {
    public static void main(String[] args) {
        List<String> cities = Arrays.stream(Locale.getISOCountries()).collect(Collectors.toList());
        Consumer<List<String>> testConsumer = citiesList->{

            for (int i = 0; i < citiesList.size(); i++) {
                citiesList.set(i, citiesList.get(i).toUpperCase());
            }

        };

        Consumer<List<String>> printCountries = list-> list.forEach(System.out::println);

        testConsumer.andThen(printCountries).accept(cities);

    }
}
