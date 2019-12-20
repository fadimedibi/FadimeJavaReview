package com.review11;
public abstract class Human1 {
	String name;
	int age;
	int weight;
​	public Human1() {
		// super();
		System.out.println("A human being is created.");
	}
​
	public Human1(String name) {
		
		this(); // first statement
​
//		System.out.println("The name of that person is " + this.name);
		this.name = name; // second statement
		System.out.println("The name of that person is " + this.name);	
	}
​	public Human1(String name, int age, int weight) {
		this(name);
		this.age = age;
		this.weight = weight;
	}
​
	public abstract String greeting();
​
	public abstract void talk();
​
}

