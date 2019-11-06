package com.review2;

public class NestedifStatement {
	public static void main(String[] args) {

		boolean hasMoney = false;
		boolean isRestNear = false;

		if (hasMoney == true) {
			if (isRestNear) {
				System.out.println("I will eat in the restaurant");

			} else {
				System.out.println("can't walk long distance.");
			}
		} else {
			System.out.println("I will not go outside");
		}
	}
}
