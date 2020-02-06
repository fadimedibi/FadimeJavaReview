package com.review14;

import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
try {
		System.out.println("Please enter a number");

		int a = scan.nextInt();
			
	}catch(Exception e) {
		System.out.println("Exception : "+e);
		System.out.println("Message : "+ e.getMessage());
		System.out.println("Class : "+e.getClass());
		e.printStackTrace();
	}finally {
		System.out.println("Happy ending!!!");
	}

		System.out.println("Please enter another number");

		int b = scan.nextInt();
	}

}
