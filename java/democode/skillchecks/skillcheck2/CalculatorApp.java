package com.accenture.democode.skillchecks.skillcheck2;

import java.util.Scanner;

public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

         boolean repeat = false;
        do {
            System.out.println("\n" + "Calculator" + "\n" +
                    "1 - Add" + "\n" +
                    "2 - Subtract" + "\n" +
                    "3 - Multiply" + "\n" +
                    "4 - Divide" + "\n" +
                    "5 - Exit" + "\n"
            );

            System.out.print("Select from 1 - 5: ");
            String userInput = scanner.nextLine();
            // Display selected operator
            switch (userInput) {
                case "1": // 1 == Add
                    add();
                    repeat = true;
                    break;
                case "2": // 2 == Subtract
                    subtract();
                    repeat = true;
                    break;
                case "3": // 3 == Multiply
                    multiply();
                    repeat = true;
                    break;
                case "4": // 4 == Division
                    divide();
                    repeat = true;
                    break;
                case "5":
                    repeat = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    repeat = true;
                    break;
            }
        } while (repeat);

        System.out.println("Exiting Program...");

    }

    public static void add() {
        System.out.println("Add");
        System.out.print("Enter first number: ");
        String firstNumber = scanner.nextLine();

        System.out.print("Enter second number: ");
        String secondNumber = scanner.nextLine();

        int result = Integer.valueOf(firstNumber) + Integer.valueOf(secondNumber);
        System.out.println("Sum: " + result);

    }

    public static void subtract() {
        System.out.println("Subtract");
        System.out.print("Enter first number: ");
        String firstNumber = scanner.nextLine();

        System.out.print("Enter second number: ");
        String secondNumber = scanner.nextLine();

        int result = Integer.valueOf(firstNumber) - Integer.valueOf(secondNumber);
        System.out.println("Difference: " + result);
    }

    public static void multiply() {
        System.out.println("Multiply");
        System.out.print("Enter first number: ");
        String firstNumber = scanner.nextLine();

        System.out.print("Enter second number: ");
        String secondNumber = scanner.nextLine();

        int result = Integer.valueOf(firstNumber) * Integer.valueOf(secondNumber);
        System.out.println("Product: " + result);
    }

    public static void divide() {
        System.out.println("Divide");
        System.out.print("Enter first number: ");
        String firstNumber = scanner.nextLine();

        System.out.print("Enter second number: ");
        String secondNumber = scanner.nextLine();
        
        int resultQuotient = 0;
        
        try {
            resultQuotient = Integer.valueOf(firstNumber) / Integer.valueOf(secondNumber);
            int resultRemainder = Integer.valueOf(firstNumber) % Integer.valueOf(secondNumber);
            System.out.println("Quotient: " + resultQuotient);
            System.out.println("Remainder:" + resultRemainder);
        }catch (Exception e) {
            System.out.println("Quotient: " + "undefine");
        }
    }
}
