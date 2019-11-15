package com.review8;

public class MathOperations {
	
	
	int add(int number1, int number2, int number3) {
		int sum = number1 + number2 + number3;
//		System.out.println("The sum is " + sum);
		return sum;
	}

	int substract(int number1, int number2) {
		int result = number1 - number2;
	//	System.out.println("The substract is " + result);
		return result;
		
	}

	double multiply(double num1, double num2) {
		double result = num1 * num2;
		//System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + result);
		return result;
	}
	
	int multiply2(double num1, double num2) {
		int result=(int)(num1*num2);
		return result;
	}

	double divide(double num1, double num2) {
		double result=0;
		if(num2==0) {
			System.out.println("We can not divide by zero!!");
		}else {
		result = num1 / num2;
		//System.out.println("The division of " + num1 + " by " + num2 + " is " + result);
		}
		return result;
	}
	
	String dummy(int num) {
		return "hahaha";
	}
	
	
}
