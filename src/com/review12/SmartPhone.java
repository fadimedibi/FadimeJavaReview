package com.review12;


public class SmartPhone extends Phone implements Weather, Camera {

	public SmartPhone(String serialNbr) {
		super(serialNbr);
	}
	
	public SmartPhone(String serialNbr, String color) {
		super(serialNbr);
		super.color=color;
	}

	@Override
	public void showWeather() {
		System.out.println("Showing the weather...");
		
	}

	@Override
	public void takePicture() {
	System.out.println("Taking a high quality picture...");
		
	}

	@Override
	public void recordVideo() {
		System.out.println("Recording video.....");
		
	}

public void displayInfo() {
	System.out.println("I am a "+color+" Smartphone.");
}

	
}
