package com.review6;

public class ToCharArrayDemo {

	public static void main(String[] args) {
		
		String longStr = "I am very happy today, because today is not Monday.";
		char[]charArray=longStr.toCharArray();
		System.out.println(longStr.length());
		System.out.println(charArray.length);
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println("**************************************");
		
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println("**************************************");
		
		//for each loop/enhanced loop:
		
		for(char element: charArray) {
			System.out.print(element);
		}
		System.out.println("*********************************");
		String anotherStr="";
		anotherStr+='A';
		anotherStr+='B';
		anotherStr+='C';
		System.out.println(anotherStr);
		
		System.out.println("****************************");
		
		for(char element:charArray) {
			if(element=='a') {
				anotherStr+='e';
			}else {
				anotherStr+=element;
			}
			
			}
		System.out.println(anotherStr);
		
		System.out.println("****************************");
		
		anotherStr="";
		for (int i = 0; i < charArray.length; i++) {
			char element=charArray[i];
			if(element==',') {
				anotherStr+=';';
			}else {
			anotherStr+=element;
			}	
			}
		System.out.println(anotherStr);
		
		System.out.println("*******************************");
		System.out.println("*******************************");
	//reverse and replace method together:
		for (int i = charArray.length-1; i >=0 ; i--) {
			char element=charArray[i];
			if(element==',') {
				anotherStr+=';';
			}else {
			anotherStr+=element;
			}	
			}
		System.out.println(anotherStr);
	}

}
