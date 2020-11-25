package day3problem;

import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("first name: ");
		String fname = input.nextLine();
		System.out.print("last name: ");
		String lname = input.nextLine();
		System.out.print("Your full name is " + fname + " " + lname);

	}

}
