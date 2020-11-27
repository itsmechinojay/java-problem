package com.accenture.democode.skillchecks.skillcheck2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            // ask user to select function
            displayPrompt();
            userInput = scanner.nextLine();
            System.out.println();

            switch (userInput) {
                case "1":
                    addNumberPrompt();
                    break;
                case "2":
                    subtractNumberPrompt();
                    break;
                case "3":
                    multiplyNumberPrompt();
                    break;
                case "4":
                    divideNumberPrompt();
                    break;
                case "5":
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println();

        } while(!userInput.equals("5"));
    }

    public static void displayPrompt() {
        System.out.println("Calculator");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("5 - Exit");
        System.out.print("Select from 1 - 5: ");
    }

    public static int askInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        return Integer.valueOf(scanner.nextLine());
    }

    public static void addNumberPrompt() {
        System.out.println("Add");
        int num1 = askInputNumber();
        int num2 = askInputNumber();

        int result = num1 + num2;
        System.out.println("Sum: " + result);
    }

    public static void subtractNumberPrompt() {
        System.out.println("Subtract");
        int num1 = askInputNumber();
        int num2 = askInputNumber();

        int result = num1 - num2;
        System.out.println("Difference: " + result);
    }

    public static void multiplyNumberPrompt() {
        System.out.println("Multiply");
        int num1 = askInputNumber();
        int num2 = askInputNumber();

        int result = num1 * num2;
        System.out.println("Product: " + result);
    }

    public static void divideNumberPrompt() {
        System.out.println("Divide");
        int num1 = askInputNumber();
        int num2 = askInputNumber();

        // check if divide by non-zero
        if (num2 != 0) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Quotient: undefine");
        }

    }


}
