package com.review8;

public class World {

	public static void main(String[] args) {
	Baby baby1=new Baby();

	baby1.cry();
	
	
baby1.firstName="John";
baby1.lastName="Doe";
baby1.gender='M';
baby1.weight=7;
baby1.hairColor="Yellow";

System.out.println(baby1.firstName);

System.out.println(baby1.gender);

baby1.walk(5);
System.out.println("Done with baby one");


Baby baby2=new Baby();
baby2.firstName="Ann";
baby2.lastName="Smith";
baby2.gender='F';
baby2.weight=6;
baby2.hairColor="Black";

baby2.displayBabyInfo();
baby1.displayBabyInfo();
	}

}
