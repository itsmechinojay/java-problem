package com.accenture.democode.day9.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemSortComparableDemo {

    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("Laptop", 40000));
        itemList.add(new Item("Headset", 2000));
        itemList.add(new Item("Speaker", 2500));
        itemList.add(new Item("Keyboard", 1000));
        itemList.add(new Item("Mouse", 1000));

        System.out.println(itemList);
        Collections.sort(itemList);
        System.out.println(itemList);

    }
}
