package com.review14;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number");
	
		int a=scan.nextInt();
		
		System.out.println("Please enter another number");
		
		int b=scan.nextInt();
		
		int result=0;
		try {
		 result=a/b;
		}catch(ArithmeticException ae) {
			System.out.println("I couldn't divide "+a+" by "+b);
		}
		
		
		
		System.out.println("The division result is: "+result);
	
	
	}

}
