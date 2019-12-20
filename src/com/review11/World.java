package com.review11;

public class World {

	public static void main(String[] args) {
		
		Human person1=new Human("Andrea");
		Human person2=new Human("Salim",25,150);
		
		System.out.println("-----America------");
		Human person3=new American("John",42,250, "111-22-3333");
		System.out.println("-----Albania------");
		Human person4=new Albanian("Mother Teresa", 40,160,"20007865" );
		System.out.println("-----America------");
		Human person5=new Turkish("Ne Sen Sor Ne ben soyleyeyim", 34,200,"2908675432");
		
		System.out.println("The world ended");
	}

}
