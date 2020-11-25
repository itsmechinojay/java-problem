package day3problem;

import java.util.Scanner;

public class CheckMultiplesOf3Or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Input a Number: ");
		int num = input.nextInt();

		boolean t = (num % 5 == 0) || (num % 3 == 0);
		System.out.println("Is the number " + num + " either a multiple of 3 or 5? " + t);

	}

}
