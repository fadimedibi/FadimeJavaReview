package com.review9;

public class Car {
	
	String make;
	String color;
	
	
	public Car() {		// if there is no parameters , it's called default constructor
		
	}
	
	public Car(String type) {  // another constructor with parameter
		make=type;
		
	}
	
	public Car(String type, String carColor) {
		make=type;
		color=carColor;
	}
	
	
	
	public void displayInfo() {
		System.out.println("This is a car made by "+make+" and the color of the car is "+color);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	String make;
//	String color;
//	
//	public Car() {
//		
//	}
//	public Car(String type) {
//		make=type;
//		
//		
//	}
//	public Car(String type, String carColor) {
//	make= type;
//	color= carColor;
//	}
//	
//	
//	public void displayInfo() {
//		System.out.println("This car is: "+make+ " , color is: "+color);
//		
		
		
//	}
	
	
	
}
