package day4problem;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputCase = Function();
        double doubleEqual = 0;

        for (int i=inputCase;i>0 &&i < 5;i=inputCase) {
                System.out.print("Input first number: ");
                double double1stnum = input.nextDouble();
                System.out.print("Input second number: ");
                double double2ndnum = input.nextDouble();
                String stringEqua = "";

                switch (inputCase) {
                    case 1:
                        doubleEqual = double1stnum + double2ndnum;
                        stringEqua = "The Sum of ";
                        break;
                    case 2:
                        doubleEqual = double1stnum - double2ndnum;
                        stringEqua = "The Difference of ";
                        break;
                    case 3:
                        doubleEqual = double1stnum * double2ndnum;
                        stringEqua = "The Product of ";
                        break;
                    default:
                        doubleEqual = double1stnum / double2ndnum;
                        stringEqua = "The Quotient of ";
                }

                System.out.println(stringEqua + double1stnum +
                        " and " + double2ndnum +
                        " is " + doubleEqual);

                inputCase = Function();
        }
    }

    public static int Function(){

        Scanner input = new Scanner(System.in);


        System.out.print("\nFunction: [1]add [2]sub [3]mul [4]div [5]exit \n");
        System.out.print("Select function (1-5): ");
        int inputCase = input.nextInt();
        return inputCase;
    }
}
