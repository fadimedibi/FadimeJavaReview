package com.review11;

public class Rectangle extends Shape2D {
int width;
int height;
String color;

public Rectangle(int width, int height, String color) {
	super(color);
	this.width=width;
	this.height=height;
	this.color=color;
	
}
public double calculateArea() {
	
	return width*height;
}
public double calculatePerimeter() {
	return width* height;
}
}
