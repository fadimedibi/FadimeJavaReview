package com.review14;

public class ThrowsExample {

	public static void main(String[] args) throws Exception {
		try {
	int result=	divide(15,0);
		System.out.println("Result is: "+result);
		}catch(Exception ex) {
		System.out.println("Happy ending");
		}
	}
	public static int divide(int a, int b) throws Exception {
		int result=a/b;
		return result;
	}

}
