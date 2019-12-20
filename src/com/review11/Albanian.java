package com.review11;

public class Albanian extends Human{
String albanianId;
 public Albanian(String name, int age, int weight, String albanianId) {
	 super(name,age, weight);
	 this.albanianId=albanianId;
 }
	public void friendly() {
		System.out.println("I am very friendly");
	}
}
