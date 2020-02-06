package com.review14;

public class ExceptionsDemo {

	public static void main(String[] args) {

		int a = 6;
		int b = 0;
		int c = 100;

		try {
			c = a / b;
		} catch (ArithmeticException ae) {
			
			System.out.println("Exception: "+ae);
			System.out.println("Message: "+ ae.getMessage());
			System.out.println("Print stack Trace:");
			ae.printStackTrace();
		//	System.out.println("Some error occured");

		}

		System.out.println(c);

		System.out.println("Happy Ending!!!");
	}

}
