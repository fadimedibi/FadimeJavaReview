package com.review9;

public class Application {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 2, 9, 3, 6 };

		ArrayManipulation obj1 = new ArrayManipulation();
		int largest = obj1.largestNumber(arr);

		System.out.println("Largest of the array= "+largest);
		
		int sum= obj1.sumOfArray(arr);
		System.out.println("Sum of the numbers in the array= "+sum);
	}
}