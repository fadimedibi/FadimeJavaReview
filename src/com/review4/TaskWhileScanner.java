package com.review4;

import java.util.Scanner;

public class TaskWhileScanner {

	public static void main(String[] args) {
		
		/* Prompt the user to ask the name 3 times and print "Hello____" */
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your name");
			String name = scan.nextLine();
			int b = 1;
			while (b<= 3) {
			System.out.println("Hello " + name);
			b++;
		}
	}

}
