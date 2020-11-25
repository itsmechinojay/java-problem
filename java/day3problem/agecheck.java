package day3problem;

import java.util.Scanner;

public class agecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Age: ");
		int age = input.nextInt();

		boolean minor = age < 18;
		boolean adult = age >= 18;
		boolean senior = age >= 60;

		System.out.println("Minor? " + minor);
		System.out.println("Adult? " + adult);
		System.out.println("Senior? " + senior);

	}

}
