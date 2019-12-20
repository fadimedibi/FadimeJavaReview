package com.review11;

public class Circle extends Shape2D {
 final double pi=3.14;
 int radius;
 String color;
 
 public Circle(int radius,String color) {
	 super(color);
 this.radius=radius;
 this.color=color;
 }
 public double calculateArea() {
	 return pi*radius*radius;
 }
 public double calculatePerimeter() {
	 return 2*radius*radius;
 }
 public double calculateDiameter() {
	 return 2*radius;
 }
}
