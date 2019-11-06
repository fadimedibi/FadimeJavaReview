package com.review4;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		* Create a boolean variable workDay and assign tru
		e create
		int variable day and
		* assign it to 1 As long as it is workDay print
		and
		increase
		* day. Once day is 6 print
		*/
	boolean workDay = true;
		int day = 1;
		while (workDay) {
		if (day == 6 || day==7) {
		workDay = false;
		System.out.println("I do not need a day of anymore");
		}else {
		System.out.println("I need a day off");
		}
		day++;
		}
	}
}





