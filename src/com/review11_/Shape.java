package com.review11_;

public abstract class Shape {
	static int totalShapes;
	String color;
	final double pi = 3.14;

	public Shape(String color) {
		this.color = color;
		totalShapes++;
	}

	public abstract double calculateArea();
	public static void displayTotal() {
		System.out.println("Total shapes= "+totalShapes);
	}
}
