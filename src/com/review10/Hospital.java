package com.review10;

public class Hospital {
public static void main(String[] args) {
	Doctor d1=new Doctor("John", "Family Doctor", 123456);
//	d1.name="John";
//	d1.speciality="Family Doctor";
//	d1.licenceId=123456;
	
	
	d1.displayInfo();
	d1.CheckUp("Adam");
	d1.treatPatients();
	d1.chargePatient();
	
	Doctor d2=new Doctor("James","Eye Doctor", 23456, "123 Main st.", "Sunday");
	d2.displayInfo();
	d2.displayInfo1();
	d2.CheckUp("Alex");
	
	System.out.println("----- Create dermatologist------");
	Dermatologist d3=new Dermatologist("Emily","Dermatologist", 345678);
	d3.displayInfo();
	d3.CheckUp("Anna");
	d3.chargePatient();
	d3.applySkinTreatment();
	
	System.out.println("-----Create ENT------");
	ENT d4=new ENT("Bulent", "ENT", 567890);
	d4.displayInfo();
	d4.chargePatient();
	d4.CheckUp("Mehmet");
	
	System.out.println("-----Polymorphism----");
	Doctor d5;
	d5=new ENT("Oz", "ENT", 678901);
	
	Dermatologist d6=new Dermatologist("Wang", "Dermatologist", 7890123);
	
	Doctor d7=d6;
	Doctor[] doctors=new Doctor[5];
//	int[] ints=new int[5];  like this
	doctors[0]=d1;
	doctors[1]=d2;
	doctors[2]=d3;
	doctors[3]=d4;
	doctors[4]=d5;
	
	
	System.out.println("----1st way-----------");
	for (int i = 0; i < doctors.length; i++) {
		
		Doctor d= doctors[i];
		d.displayInfo();
		d.chargePatient();
		
	}
	System.out.println("----2nd way-----------");
	for(Doctor doc:doctors) {
		doc.displayInfo();
	}
}
}
