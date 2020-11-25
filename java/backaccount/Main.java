package backaccount;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        Account userAccount = new Account();

        System.out.println("Enter Name: ");
        String stringName = input.next();
        userAccount.setCustomerName(stringName);
        System.out.println("Enter Balance: ");
        double doubleBalance = input.nextDouble();
        userAccount.setBalance(doubleBalance);


        int inputCase = function();

        while (inputCase > 0 && inputCase < 4) {
            switch (inputCase) {
                case 1:
                    userAccount.status();
                    break;
                case 2:
                    System.out.println("Enter Amount to Deposit: ");
                    double deposit = input.nextDouble();
                    userAccount.deposit(deposit);
                    break;
                default:
                    System.out.println("Enter Amount to Transfer: ");
                    double transfer = input.nextDouble();
                    userAccount.transfer(transfer);
                    break;
            }
            inputCase = function();
        }

    }

    public static int function() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nFunction: [1]Check Balance [2]Add Funds [3]Transfer Funds [4]exit \n");
        System.out.print("Select function (1-4): ");
        int inputCase = input.nextInt();
        return inputCase;
    }
}
