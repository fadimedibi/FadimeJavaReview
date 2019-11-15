package com.review6;

public class SplitDemo {

	public static void main(String[] args) {

		String longStr = "I am very happy today, because today is not Monday.";
		String[] anotherStr = longStr.split("today");
		System.out.println(anotherStr.length);

//		System.out.println(anotherStr[0]);
//		System.out.println(anotherStr[1]);
//		System.out.println(anotherStr[2]);

		System.out.println("*******for loop**************");
		for (int i = 0; i < anotherStr.length; i++) {
			System.out.print(anotherStr[i]);

		}
		System.out.println();
		System.out.println("*******for loop and reverse**************");
		for (int i = anotherStr.length - 1; i >= 0; i--) {
			System.out.print(anotherStr[i]);
		}
		System.out.println();
		System.out.println("*******for each loop**************");
		for (String str : anotherStr) {
			System.out.print(str);
			
		}
		System.out.println("*******for loop+ adding today**************");
		for (int i = 0; i < anotherStr.length; i++) {
			if(i==anotherStr.length-1) {
				System.out.print(anotherStr[i]);
			}else {
				System.out.print(anotherStr[i]+" today");
			}
		}
		System.out.println();
		System.out.println("*********************************");	
		
		anotherStr=longStr.split("[A-Z]");
		System.out.println(anotherStr.length);
		System.out.println(anotherStr[0]);
		System.out.println(anotherStr[1]);
		System.out.println(anotherStr[2]);
		
		anotherStr=longStr.split(" ");
		
		for(String str:anotherStr) {
			System.out.println(str);
			
		}
		
		longStr="I like number 3 and 4 because 7 ate 9";
		anotherStr=longStr.split("[0-9]");
		for(String str:anotherStr) {
			System.out.println(str);
		}
	
		
	}

}
