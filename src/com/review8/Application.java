package com.review8;

public class Application {

	public static void main(String[] args) {
		
		MathOperations mathOps= new MathOperations();
		
		mathOps.add(3,4,5);
		mathOps.add(3, 6, 9);
		mathOps.substract(10, 2);
		mathOps.multiply(3, 4.5);
		mathOps.divide(4.8, 1.2);
	
int sum=mathOps.add(2, 1, 3);
System.out.println(sum);
	
int result=mathOps.substract(10, 3);
System.out.println("The result is "+result);

double d1=mathOps.multiply(3, 4.5);
System.out.println("The multiplication result is "+d1);


double d2=mathOps.divide(4.8, 1.2);
System.out.println("The division result is "+d2);

double d3=mathOps.divide(9.3, 0);
System.out.println("The division result is "+d3);


int i=mathOps.multiply2(3.4, 2.3);
System.out.println("The multiplication result is "+i);


String str=mathOps.dummy(3);
System.out.println(str);
	}

}
