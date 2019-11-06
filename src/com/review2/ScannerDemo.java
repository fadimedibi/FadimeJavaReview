package com.review2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// scanner is a class present in java.util package
		// which allow us to take user input
		// Sortcuts for scanner mac users Command+Shift+o
		// windows Ctrl+Shift+o

		Scanner keyBInput = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = keyBInput.next();

		System.out.println("Hey " + name);
		System.out.println("please enter a number");
		int num = keyBInput.nextInt();
		
		
		System.out.println("Are you a male?");
		boolean isMale=keyBInput.nextBoolean();

		if (isMale) {
			System.out.println("You are a male");
		}else {
			System.out.println("you are nat a male");
		}
		
		
	}

}
