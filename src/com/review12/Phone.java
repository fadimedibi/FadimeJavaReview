package com.review12;

public class Phone {
private String serialNumber;
String color;

public String getSerialNumber(String password) {
	String result="";
	if(password.contentEquals("123456")) {
		result=serialNumber;
	}else {
		result="Access denied!";
	}
	return result;
}
public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Phone(String serialNbr) {
	serialNumber=serialNbr;
}
public void sendText(String number, String text) {
	System.out.println("Sending: " +text+" to "+ number);
}

public void call(String number) {
	System.out.println("Calling "+number);
}

public void displayInfo() {
	System.out.println("I am a "+color+" phone. Serial number is :"+serialNumber);
}


}
