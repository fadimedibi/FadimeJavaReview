package com.review10;

public class ENT extends Doctor {
// Child class does not inherit Parent class constructor
// Child class calls/ executes one of the Parent Class constructors 
// This is already there
//	public ENT(){
//  super();	
//  }

public ENT(String name, String speciality, int licenceId) {
	
	super(name, speciality, licenceId);
	
//		this.name=name;
//		this.licenceId= licenceId;
//		this.speciality=speciality;
				
}
@Override
public void chargePatient() {
	System.out.println("Gets $1000");

}
}
