package com.review12;

public class PhoneDemo {

	public static void main(String[] args) {
	Phone phone=new Phone("1234567890");	
	phone.color="Blue";
	phone.sendText("1234-567", "Privet");
	phone.call("2345-678");
	phone.displayInfo();
	
	
	
	
	System.out.println(phone.getSerialNumber("12345"));
	
	
	System.out.println("---SmartPhone generation--------");
	
	//SmartPhone iphone1=new SmartPhone("i1234-456","Red");

	System.out.println("-----up casting------");
	//up casting is done implicitly
	Phone iphone1=new SmartPhone("i1234-456","Red");
//	iphone1.showWeather();// This is from sub class, parent class(Phone) does not have this method
	iphone1.call("34567");
	iphone1.sendText("34567","selam");
	iphone1.displayInfo();
	
	System.out.println("---down casting-----");
	//down casting has to be done explicitly
	SmartPhone smartPhone1 =(SmartPhone) iphone1;
	smartPhone1.showWeather();
	smartPhone1.takePicture();
	smartPhone1.recordVideo();
	}

}
