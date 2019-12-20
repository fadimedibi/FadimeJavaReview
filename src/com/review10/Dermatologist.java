package com.review10;

public class Dermatologist extends Doctor {

	public Dermatologist(String name, String speciality, int licenceId){
	//	super(); Java implicitly calls/executes default constructor of the class
		this.name=name;
		this.speciality=speciality;
		this.licenceId=licenceId;
				
	}
	
	@Override
	public void chargePatient() {
		System.out.println("Gets $250"); 
	}
	@Override
	public void CheckUp(String name) {
		System.out.println("Doctor "+ this.name+ " ordered allergy tests for "+ name);
		
	}
	
	
	public void applySkinTreatment() {
		System.out.println("Applies related cream");
	}
	
}
