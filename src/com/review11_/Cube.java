package com.review11_;

public class Cube extends Shape3D {
	int side;
	String color;

	public Cube(int width, String color) {
		super(color);
		this.side = width;
	}

	@Override
	public double calculateArea() {

		return 6 * side * side;
	}

	@Override
	public double calculateVolume() {

		return side * side * side;
	}
}
