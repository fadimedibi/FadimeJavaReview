package com.review9;

public class Task {

	//Create a SuperCar class.
	//It should have at least 10 variables, like : make, brand, year, manufacture, axle, tireNumber,,,
	//Create at least 4 Constructors with different number of parameters.
	
public static void main(String[] args) {
	SuperClass c1=new SuperClass("Honda", 4);
	SuperClass c2=new SuperClass(2019,"white","Toyota", "Prius");
	SuperClass c3=new SuperClass("Renault", "Symbol", "Silver", 2005,4,4,false,false,false);
	SuperClass c4=new SuperClass("Honda", "Odessey","Silver", 2019,2, 4, true,true,true);
	System.out.println("make		brand		color		year		axle		door		gps		entertainmentSys		seatHeating");
	
	c1.displayInfo();
	c2.displayInfo();
	c3.displayInfo();
	c4.displayInfo();



}	
	
}
