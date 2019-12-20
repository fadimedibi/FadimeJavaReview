package com.review10;

public class Doctor {

	
	String name;
	String speciality;
	int licenceId;
	String address;
	String dayOff;
	
	public Doctor() {
		
	}
	
	public Doctor(String name, String speciality, int licenceId) {
		this.name=name;
		this.licenceId= licenceId;
		this.speciality=speciality;
				
		
	}
	public Doctor(String name, String speciality, int licenceId, String address, String dayOff ) {
		
	this(name, speciality,licenceId);
	
	
	//this.name=name;
	//this.licenceId= licenceId;
	//this.speciality=speciality;
	
	this.address=address;
	this.dayOff=dayOff;
	
	
	}
	public void CheckUp(String name) {
		System.out.println("Doctor "+ this.name+ " ordered blood tests for "+ name);
		
	}
	public void treatPatients() {
		
		System.out.println("Gives a prescription.");
		
	}
	public void chargePatient() {
		System.out.println("Gets $100");
	}
	public void displayInfo() {
		System.out.println("Doctor "+name+" with license Id: "+ licenceId+ " is a "+speciality);
	}
	
	public void displayInfo1() {
		System.out.println("Doctor "+name+" with license Id: "+ licenceId+ " is a "+speciality+" address of the office: "+address+" off day: "+dayOff);
		
		
	}
}
