package com.accenture.democode.day9.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Java Streams
- pipeline of data

Operators
1) Source
    - Collection (List, Sets)
    - Arrays
2) Intermediate operation
    - more than one operation
    - filter()
    - sorted()
    - map()
3) Terminal operation
    - only one
    - collect()
    - sum()
    - reduce()
    - forEach()
 */
public class StreamDemo {

    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("Laptop", 40000));
        itemList.add(new Item("Headset", 2000));
        itemList.add(new Item("Speaker", 2500));
        itemList.add(new Item("Keyboard", 1000));
        itemList.add(new Item("Mouse", 1000));

        List<Item> shoppingCart = new ArrayList<>();

        shoppingCart.add(itemList.get(0));
        shoppingCart.add(itemList.get(0));
        shoppingCart.add(itemList.get(2));
        shoppingCart.add(itemList.get(2));
        shoppingCart.add(itemList.get(2));

        Map<Item, Integer> shoppingCartMap = new HashMap<>();
        /*
        {
            Item("Laptop") : count
        }
         */

        /*
            forEach()
         */
        shoppingCart.forEach(item -> {
            shoppingCartMap.put(item, shoppingCartMap.getOrDefault(item,0) + 1);
        });

        System.out.println(shoppingCartMap);
        shoppingCartMap.keySet().forEach(item -> System.out.println(item.getName() + ": " + shoppingCartMap.get(item)));

        /*
            Map Demo
         */
        // Create a new List of Doubles containing a 50% applied to the prices
        // Functional approach
        List<Double> priceDiscounts = itemList.stream()
                .map(item -> item.getPrice() * 0.5)
                .collect(Collectors.toList());

        /*
        // Imperative approach
        List<Double> priceDiscounts = new ArrayList<>();
        for (Item item : itemList) {
            priceDiscounts.add(item.getPrice() * 0.5);
        }
         */

        System.out.println(priceDiscounts);

        /*
            filter() and sort()
            - filter items that are 2500 below
            - sort in ascending order
            - return List<Items>
         */
        List<Item> filteredItems = itemList.stream()
                .filter(item -> item.getPrice() < 2500)
                .sorted((item1, item2) -> Double.compare(item1.getPrice(), item2.getPrice()))
                .collect(Collectors.toList());

        /*
        // Imperative approach
        List<Double> filteredItems = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getPrice() < 2500) {
                filteredItems.add(item);
            }
        }
        Collection.sort(filteredItems, new PriceComparator());
         */

        System.out.println(filteredItems);

    }
}
