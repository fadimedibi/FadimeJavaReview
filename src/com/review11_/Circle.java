package com.review11_;

public class Circle extends Shape2D{
int radius;
String color;

public Circle(int radius, String color) {
	super(color);
	this.radius=radius;
	}

@Override
public double calculateArea() {
	
	return pi*radius*radius;
}

@Override
public double calculatePerimeter() {
	
	return 2*pi*radius;
}
}
