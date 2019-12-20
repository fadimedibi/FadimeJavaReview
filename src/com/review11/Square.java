package com.review11;

public class Square extends Shape2D {
	int side;

	public Square(int side, String color) {
		super(color);
	}

	@Override
	public double calculateArea() {

		return side * side;
	}

	@Override
	public double calculatePerimeter() {

		return 4 * side;
	}
}
