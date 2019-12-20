package com.review9;

public class ArrayManipulation {

	protected int largestNumber(int[] array) {
		int max = array[0];
		for (int element : array) { // for (int i = 0; i < array.length; i++)
			if (element > max) {
				max = element;
			}

		}
		return max;
	}
	public static int sumOfArray(int[] array) {
		int total=0; 
		for(int element :array) {
			total+=element;
		}
		
		return total;
	}
}
