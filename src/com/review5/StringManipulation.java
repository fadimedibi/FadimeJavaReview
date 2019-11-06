package com.review5;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "Hello";

	
		System.out.println(str.length());	// find the length of the string
	
		System.out.println(str.toLowerCase());//make all the letters lower case
		//or
		//String str1=str.toLowerCase();
		//or 
		// str=str.toLowerCase();
				
		System.out.println(str.toUpperCase());//make all the letters lower case
		
		System.out.println(str.equals("hello"));//equals
		
		System.out.println(str.equalsIgnoreCase("hello"));//equals ignore case
		
		System.out.println(str.contains("ll"));//contains
		System.out.println(str.startsWith("He"));//starts with
		System.out.println(str.startsWith("ll",2));//starts with index number
		System.out.println(str.endsWith("ll"));//ends with
		System.out.println(str.isEmpty());//empty??
		System.out.println(str.concat(" ").concat("World "));//concat
		System.out.println(str.trim().concat("Buddies"));//trim
		System.out.println(str.charAt(0));//charAt()
		
		String newStr= ""+ str.charAt(0)+ str.charAt(1)+ str.charAt(2);
		System.out.println(newStr);//charAt()
		
		System.out.println(str.indexOf('l'));// indexOf
		System.out.println(str.indexOf("l"));
		System.out.println(str.indexOf("Hell",2));
		
	}

}
