package com.review6;

public class ReplaceDemo {

	public static void main(String[] args) {

		String longStr = "I am very happy today, because today is not Monday.";
		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);

//   System.out.println(longStr.replace(',',':'));

		String otherStr = longStr.replace('a', 'e').replace('M', 'E');
		System.out.println(otherStr);
		
		anotherStr=longStr.replace("today","tomorrow");
		System.out.println(anotherStr);
		
		anotherStr=longStr.replace(",", "");
		System.out.println(anotherStr);
		
//		longStr.replace('A', "R");  replace method parameters should be same like both char, or both string
	
		System.out.println(longStr.replaceAll("h", "e"));
		
		System.out.println(longStr.replaceAll("today", "tomorrow"));
		
		anotherStr=longStr.replaceAll("[aZ]","e");
		System.out.println(anotherStr);
		
		anotherStr=longStr.replaceAll("[a-z]","123");
		System.out.println(anotherStr);
		
		anotherStr=longStr.replaceAll("[a-z]"," ");
		System.out.println(anotherStr);
		
		anotherStr=longStr.replaceAll("[a-z]","");
		System.out.println(anotherStr);
		
		anotherStr=longStr.replaceAll("[a-z]","1");
		System.out.println(anotherStr);
		
		anotherStr=longStr.replaceAll("[a-z]","1").replaceAll(" ", "2");
		System.out.println(anotherStr);
		
		anotherStr=longStr.replaceAll("[a-zA-Z]","");
		System.out.println(anotherStr);
		
		anotherStr=longStr.replaceAll("[a-zA-Z ,.]","1");
		System.out.println(anotherStr);
		
//		longStr="!}[(]}@{}{*";
//		anotherStr=longStr.replaceAll("{}*}!", "");
//		System.out.println(anotherStr);
		
		longStr="My Social Security number is 232-89-6789";
		anotherStr=longStr.replaceAll("[0-9]","*");
		System.out.println(anotherStr);
		
		longStr="I want to learn Java.And I want to learn more! is this OK?";
		System.out.println(longStr);
		System.out.println(longStr.replaceAll("[^a-zA-Z]","+"));//replace all characters other than letters
		
		longStr = "I am very happy today, because today is not Monday.";
		anotherStr = longStr.replaceFirst("today","tomorrow");
		System.out.println(longStr);
		System.out.println(anotherStr);
		
		System.out.println("-----------indexOf-----------------");
		
		System.out.println(longStr);
		int result=longStr.indexOf("today",18);
		System.out.println(result);
		
		
		
		
	}

}
