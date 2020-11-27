package com.accenture.democode.day4;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        // while
        int counter1 = 0;
        while (counter1++ <= 5) {
            ifLabel: if (counter1%2 == 0) {
                break ifLabel;
            }

            System.out.println("Hello World");
        }

        // do-while
//        String userInput;
//        Scanner scanner = new Scanner(System.in);
//        loop: do { // label
//            userInput = scanner.nextLine();
//            switch (userInput) {
//                case "Jeremy":
//                    System.out.println("Hello Jeremy");
//                    break loop; // breaks the do-while loop using label
//                default:
//                    System.out.println(userInput);
//            }
//        } while(!userInput.equals("q"));

        // for-loop

        // decrement
        for(int i=10; i >= 1; i--) { // 10 to 1
            System.out.println(i);
        }

        // increment
        for(int i=1; i <= 10; i++) { // 1 to 10
            System.out.println(i);
        }

    }
}
