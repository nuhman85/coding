package com.nuhman.coding.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductUtils {


    private static void learnStreamsAndLambdas() {

        List<Product> productList = List.of(new Product("Apple iPhone 13", "Electronics", 4.8, 500),
                new Product("Samsung Galaxy S21", "Electronics", 4.6, 450),
                new Product("Nike Air Max 270", "Footwear", 4.7, 300),
                new Product("Dyson V11 Vacuum Cleaner", "Home Appliances", 4.9, 150),
                new Product("Instant Pot Duo 7-in-1", "Kitchen Appliances", 4.7, 200),
                new Product("Sony WH-1000XM4 Headphones", "Electronics", 4.8, 250),
                new Product("The Hobbit by J.R.R. Tolkien", "Books", 4.9, 100),
                new Product("Patagonia Men's Better Sweater Fleece Jacket", "Clothing", 4.5, 50),
                new Product("Lego Creator Expert Roller Coaster", "Toys & Games", 4.8, 75),
                new Product("Olay Regenerist Micro-Sculpting Cream", "Beauty", 4.7, 120)

        );


        //AllMatch
        System.out.println("****AllMatch***");
        Predicate<Product> ratingGreaterThan4 = product -> product.getItemRating() > 4;
        System.out.println(productList.stream().allMatch(ratingGreaterThan4));

        //AnyMatch
        System.out.println("****AnyMatch***");
        Predicate<Product> ratingGreaterThan4point5 = product -> product.getItemRating() > 4.5;
        System.out.println(productList.stream().anyMatch(ratingGreaterThan4point5));

        //NoneMatch
        System.out.println("****NoneMatch***");
        Predicate<Product> ratingGreaterThan5 = product -> product.getItemRating() > 5;
        System.out.println(productList.stream().noneMatch(ratingGreaterThan5));


    }

    public static void main(String[] args) {
        learnStreamsAndLambdas();
    }


}
