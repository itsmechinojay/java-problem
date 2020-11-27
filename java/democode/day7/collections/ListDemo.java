package com.accenture.democode.day7.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
List
- dynamic in size
- allowed duplication
- allowed reference
 */
public class ListDemo {

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();

        // add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(60);

        System.out.println(numbers);

        // accessing elements
        int number3 = numbers.get(3);
        System.out.println(number3);

        // remove element by index
        numbers.remove(3);
        System.out.println(numbers);

        // remove element by value
        Integer someInt = Integer.valueOf(10);
        boolean isDeleted = numbers.remove(Integer.valueOf(200));
        System.out.println("isDeleted: " + isDeleted);
        System.out.println(numbers);

        // modifying element
        numbers.set(0, 123);
        System.out.println(numbers);

        // travesal of list
        List<Integer> doubleNum = new ArrayList<>();
        for(int number : numbers) {
            doubleNum.add(number*2);
        }
        System.out.println(doubleNum);

        // Sorting list
        Collections.sort(doubleNum);
        System.out.println(doubleNum);

        // Shuffle List
        Collections.shuffle(doubleNum);
        System.out.println(doubleNum);
    }
}
