package com.review2;

import java.util.Scanner;

public class BetterCalculator {

	public static void main(String[] args) {
//		int a;
//		int b;
//		String name1="John";
//		String name2="Smith";

//		System.out.println(name1.equals(name2));
//		System.out.println("a==b");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter in First Number: ");
		int num1 = scan.nextInt();

		System.out.println("Please enter in operator");
		String operator = scan.next();

		System.out.println("Enter in secand Number: ");
		int num2 = scan.nextInt();

		if (operator.equals("+")) {
			System.out.println(num1 + num2);
		} else if (operator.equals("-")) {
			System.out.println(num1 - num2);

		} else if (operator.equals("/")) {
			System.out.println(num1 / num2);

		} else if (operator.equals("*")) {

			System.out.println(num1 * num2);
		} else {
			System.out.println("Invalid operator or number entered");
			scan.close();
		}
	}

}
