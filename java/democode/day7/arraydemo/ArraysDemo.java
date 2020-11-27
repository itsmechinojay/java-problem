package com.accenture.democode.day7.arraydemo;

import java.util.Arrays;

/*
Array
- it can store multiple
- fixed size
- applicable to any datatype
 */
public class ArraysDemo {

    public static void main(String[] args) {

        // Declaring array
        String[] arrays = new String[10]; // declare an empty array with a size 10
        int[] numbers = { 1, 2, 3, 4 }; // declare an array with values
        String[] topics = {
                "Collection",
                "Arrays",
                "JUnit",
                "Threads"
        };

        // Accessing array elements
        // array index starts with index 0
        System.out.println(numbers[0]);

        // Traversing array
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            numbers[i] = 0; // set all array elements to zero
        }

        System.out.println();
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        for(String topic : topics) {
            System.out.print(topic + " ");
            topic = "TOPIC"; // this does not change the elements in the array
        }

        System.out.println();
        for(String topic : topics) {
            System.out.print(topic + " ");
        }

        // Modifying array elements
        System.out.println();
        System.out.println("BEFORE: numbers[3] = " + numbers[3]);
        numbers[3] = 123;
        System.out.println("AFTER: numbers[3] = " + numbers[3]);

        // Sorting arrays - Arrays
        double[] arrDouble = { 4.5, 3.6, 8.7, 100.2, 1.1 };
        System.out.println("Before: ");
        printArray(arrDouble);
        Arrays.sort(arrDouble);
        System.out.println("AFTER");
        printArray(arrDouble);

    }

    public static void printArray(double[] arr) {
        for(double element : arr) {
            System.out.print(element + " ");
        }
    }

}
