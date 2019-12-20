package com.review3;

public class SwitchExperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 2
//		/ Write a program to found out the user level of experience 
		// Must use a switch statement with a String variable named levelString and a
		// int variable named level
		// Beginner level should be 1
		// Intermediate level should be 2
		// Expert level should be 3

		String levelString;
		int level = 3;

		switch (level) {
		case 1:
			levelString = "Beginner";
			break;
		case 2:
			levelString = "Intermediate";
			break;
		case 3:
			levelString = "Expert";
			break;

		default:
			levelString = "Invalid";
		}
		System.out.println("Your level of experience is " + levelString);
	}

}
