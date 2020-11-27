package com.accenture.democode.day9.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemSortComparatorDemo2 {

    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("Laptop", 40000));
        itemList.add(new Item("Headset", 2000));
        itemList.add(new Item("Speaker", 2500));
        itemList.add(new Item("Keyboard", 1000));
        itemList.add(new Item("Mouse", 1000));

        System.out.println(itemList);

        // Anonymous class declaration
        // - no need to define another class
        Comparator<Item> priceComparator = new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o1.getPrice(),o2.getPrice());
            }
        };

        Collections.sort(itemList, priceComparator);
        System.out.println(itemList);

    }
}
