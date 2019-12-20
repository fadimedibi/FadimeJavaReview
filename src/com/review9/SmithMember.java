package com.review9;

public class SmithMember {

	static int count;
	static String lastName;
	static int familyIncome;
	
	String firstName;
	char gender;
	int salary;
	
	public static void AddIncome(int salary){
		familyIncome+=salary;
	}
	public void increment() {
		count++;
	}
	public void memberInfo() {
		System.out.println(firstName+" "+lastName+ " makes "+salary+ " monthly.");
	}
	
	
	
}
