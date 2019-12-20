package com.review11_;

public class ShapeDemo {

	public static void main(String[] args) {

		Shape2D rectangle = new Rectangle(3, 4, "red");
		System.out.println("Area of " + rectangle.color + " Rectangle= " + rectangle.calculateArea());
		System.out.println("Perimeter of " + rectangle.color + "Rectangle= " + rectangle.calculatePerimeter());
		Shape2D circle = new Circle(7, "black");
		System.out.println("Area of " + circle.color + " Circle= " + circle.calculateArea());
		System.out.println("Perimeter of " + circle.color + "Circle= " + circle.calculatePerimeter());
		Shape2D square = new Square(10, "blue");
		System.out.println("Area of " + square.color + " Square= " + square.calculateArea());
		System.out.println("Perimeter of " + square.color + " Square= " + square.calculatePerimeter());

		System.out.println("-----------------------");
		Shape3D cube = new Cube(5, "blue");
		System.out.println("Area of " + cube.color + " cube= " + cube.calculateArea());
		System.out.println("Volume of " + cube.color + " cube= " + cube.calculateVolume());
		Shape3D sphere = new Sphere(6, "pink");
		System.out.println("Area of " + sphere.color + " cube= " + sphere.calculateArea());
		System.out.println("Volume of " + sphere.color + " cube= " + sphere.calculateVolume());
		Shape.displayTotal();

		System.out.println("---------Shape2D Array------");
		Shape2D[] shapes = new Shape2D[3];
		shapes[0] = rectangle;
		shapes[1] = circle;
		shapes[2] = square;
		double totalArea2D = 0;
		double totalPerimeter2D = 0;
		for (Shape2D element : shapes) {
			totalArea2D += element.calculateArea();
			totalPerimeter2D += element.calculatePerimeter();
		}
		System.out.println("Total Area of 2D shapes= " + totalArea2D);
		System.out.println("Total Perimeter of 2D shapes= " + totalPerimeter2D);

		System.out.println("---------Shape3D Array------");
		Shape3D[] shp3d = new Shape3D[2];
		shp3d[0] = cube;
		shp3d[1] = sphere;
		double totalArea3D = 0;
		double totalVolume3D = 0;
		for (Shape3D element : shp3d) {
			totalArea3D += element.calculateArea();
			totalVolume3D += element.calculateVolume();
		}
		System.out.println("Total Area of 3D shapes= " + totalArea3D);
		System.out.println("Total Volume of 3D shapes= " + totalVolume3D);

	}

}
