package com.accenture.democode.day9.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemSortComparatorDemo3 {

    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("Laptop", 40000));
        itemList.add(new Item("Headset", 2000));
        itemList.add(new Item("Speaker", 2500));
        itemList.add(new Item("Keyboard", 1000));
        itemList.add(new Item("Mouse", 1000));

        System.out.println(itemList);

        /*
        Lambda expression
            - function/method that has no declaration
            - alternative way of defining an interface object
            - applicable only to functional interfaces - only 1 abstract method
         */

        // Defining comparator with lambda expression
        Comparator<Item> priceComparator = (o1, o2) -> {
            double price1 = o1.getPrice();
            double price2 = o2.getPrice();
            return Double.compare(price1, price2);
        };

        // Direct return lambda expression
//        Comparator<Item> priceComparator = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());

        Collections.sort(itemList, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        System.out.println(itemList);

    }
}
