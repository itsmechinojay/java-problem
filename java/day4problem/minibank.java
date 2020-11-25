package day4problem;

import java.util.Scanner;

public class minibank {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Input Name: ");
        String stringName = input.next();
        System.out.print("Input Balance: ");
        double doubleBalance = input.nextDouble();

        int inputCase = Function();

        while (inputCase > 0 && inputCase < 4) {
            switch (inputCase) {
                case 1:
                    System.out.println("Name: "+stringName);
                    System.out.println("Current Balance: " + doubleBalance);
                    break;
                case 2:
                    doubleBalance = AddFunds(doubleBalance);
                    break;
                default:
                    doubleBalance = TransferFunds(doubleBalance);
                    break;
            }
            inputCase = Function();
        }
    }


    public static double AddFunds(double doubleBalance) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Amount to add: ");
        double doubleAmount = input.nextDouble();
        doubleBalance = doubleAmount + doubleBalance;
        return doubleBalance;//returning new balance

    }


    public static double TransferFunds(double doubleBalance) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Amount to transfer: ");
        double doubleAmount = input.nextDouble();
        doubleBalance = doubleBalance - doubleAmount;
        return doubleBalance;

    }

    public static int Function() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nFunction: [1]Check Balance [2]Add Funds [3]Transfer Funds [4]exit \n");
        System.out.print("Select function (1-4): ");
        int inputCase = input.nextInt();
        return inputCase;
    }
}
