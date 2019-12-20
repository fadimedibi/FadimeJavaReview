package com.review9;

public class ConstructorsDemo {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.displayInfo(); // before assigning the values

		car1.make = "Honda";
		car1.color = "Red";

		car1.displayInfo(); // after assigning the values

		Car car2 = new Car("Toyota");
		car2.displayInfo();
		car2.make = "Honda";
		car2.color = "Grey";
		car2.displayInfo();

		Car car3 = new Car("Jeep", "Blue");
		car3.displayInfo();
	}

//	public static void main(String[] args) {
//		Car car1=new Car();		
//		car1.displayInfo();
//		
//		car1.make="Honda";
//		car1.color="Red";
//		
//		car1.displayInfo();
//		System.out.println();
//		
//		Car car2=new Car("Toyota");		//constructors 
//				car2.displayInfo();
//				//car2.make="Toyota";
//				car2.color="Gray";
//				car2.displayInfo();
//				
//				System.out.println();
//				
//				Car car3=new Car("Jeep", "Blue");			//
//				car3.displayInfo();
//		
//		
//	}

}
