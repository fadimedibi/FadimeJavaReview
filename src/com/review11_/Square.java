package com.review11_;

public class Square extends Shape2D {

	int width;
	String color;

	public Square(int width, String color) {
		super( color);
		this.width=width;

	}

	@Override
	public double calculateArea() {

		return width * width;
	}

	@Override
	public double calculatePerimeter() {

		return 4 * width;
	}
}
