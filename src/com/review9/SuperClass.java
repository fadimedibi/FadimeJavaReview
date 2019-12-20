package com.review9;

public class SuperClass {
	// Create a SuperCar class.
	// It should have at least 10 variables, like : make, brand, year, manufacture,
	// axle, tireNumber,,,
	// Create at least 4 Constructors with different number of parameters.

	String make;
	String brand;
	String color;
	int year;
	int axle;
	int tireNum;
	int door;
	boolean gps;
	boolean entertainmentSys;
	boolean seatHeating;

	public SuperClass() {

	}

	public SuperClass(String make1, int door1) {
		make = make1;
		door = door1;
	}

	public SuperClass(int year1, String color1, String make1, String brand1) {
		year = year1;
		color = color1;
		make = make1;
		brand = brand1;
	}

	public SuperClass(String make1, String brand1, String color1, int year1, int axle1, int door1, boolean gps1,
			boolean entertainmentSys1, boolean seatHeating1) {
		make = make1;
		brand = brand1;
		color = color1;
		year = year1;
		axle = axle1;
		door = door1;
		gps = gps1;
		entertainmentSys = entertainmentSys1;
		seatHeating = seatHeating1;
	}

	public void displayInfo() {
		System.out.println(make + "\t\t" + brand + "\t\t" + color + "\t\t" + year + "\t\t" + axle + "\t\t" + door
				+ "\t\t" + gps + "\t\t" + entertainmentSys + "\t\t" + seatHeating);
	}

}
