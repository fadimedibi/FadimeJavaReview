package com.review2;

public class TaskDigit {

	public static void main(String[] args) {

		int number = 370;

		if (number < 100) {
			if (number >= 10) {
				System.out.println("number is two digits");
			}

		} else if (number < 1000) {
			if (number >= 100) {
				System.out.println("number is three digits");
			}

		} else if (number < 100000) {
			if (number >= 10000) {
				System.out.println("Its a five digit number");
			}

		} else {
			System.out.println("number is not between 1 & 99999");
		}
	}
}
