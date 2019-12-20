package com.review3;
import java.util.Scanner;

public class SwitchMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 1
//      Write a program that will use a switch statement to display what month we're in.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the month number 1-12");
		int month = scan.nextInt();
		String name;

		switch (month) {
		case 1:
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;

		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
		default:
			name = "invalid";

		}
		System.out.println("We are in "+name);
	}

}
