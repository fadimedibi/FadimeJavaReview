package com.review11_;

public class Rectangle extends Shape2D {
	int width;
	int length;
	String color;

	public Rectangle(int width, int length, String color) {
		super(color);
		this.width=width;
		this.length = length;
	}

	@Override
	public double calculateArea() {

		return width * length;
	}

	@Override
	public double calculatePerimeter() {

		return 2 * (width + length);
	}
}
