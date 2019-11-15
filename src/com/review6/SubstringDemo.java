package com.review6;

public class SubstringDemo {

	public static void main(String[] args) {
		String longStr = "I am very happy today, because today is not Monday.";
		String anotherStr = longStr.substring(9);
		System.out.println(anotherStr);
		
		anotherStr=longStr.substring(10,48);
		System.out.println(anotherStr);
		
		System.out.println(longStr.length());
		
		
		
//	System.out.println(longStr.substring(20,10)); first index must be bigger than second index
		
//	System.out.println(longStr.substring(-2));
//		System.out.println(longStr.substring(10,56));	
	}

}
