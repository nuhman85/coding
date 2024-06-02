package com.nuhman.coding.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {

    private String itemName;
    private String itemCategory;
    private double itemRating;
    private int numberOfProductSold;

    @Override
    public String toString() {
        return "Product{" +
                "itemName='" + itemName + '\'' +
                ", itemCategory='" + itemCategory + '\'' +
                ", itemRating=" + itemRating +
                ", numberOfProductSold=" + numberOfProductSold +
                '}';
    }
}
