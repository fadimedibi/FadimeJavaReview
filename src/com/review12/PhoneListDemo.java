package com.review12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PhoneListDemo {

	public static void main(String[] args) {
		// ArrayList

		ArrayList<Phone> phoneList = new ArrayList<>();
		System.out.println(phoneList.size());

		Phone phone1 = new Phone("123-123"); // 1 way creating and obj with variable and adding to the list
		phoneList.add(phone1);
		phoneList.add(new Phone("234-345")); // 2 way creating obj then add the list

		int size = phoneList.size();// 1 way to get size
		System.out.println(size);
		System.out.println(phoneList.size());// 2 way to get size

		SmartPhone iphone1 = new SmartPhone("12345-678", "White");
		// up casting
		Phone phone2 = iphone1; //
		phoneList.add(phone2);

		// or phoneList.add(iphone1);

		phoneList.add(new SmartPhone("s0000", "Black"));
		System.out.println(phoneList.size());

		Phone thirdPhone = phoneList.get(2);
		thirdPhone.call("23455");
		thirdPhone.sendText("90887766", " text");
		thirdPhone.displayInfo();
		// thirdPhone.showWeather(); it does not show, we need to down casting
		SmartPhone thirdSmartPhone = (SmartPhone) thirdPhone;
		thirdSmartPhone.showWeather();

		System.out.println("---1st way---");
		for (int i = 0; i < phoneList.size(); i++) {
			Phone phone = phoneList.get(i);
			phone.displayInfo();
//			// check if the phone is of the type of SmartPhone
//			if (phone instanceof SmartPhone) {
//				// it is safe to down cast
//				SmartPhone sPhone = (SmartPhone) phone;
//				sPhone.showWeather();
//			}
		}

		System.out.println("---2nd way---");

		for (Phone element : phoneList) {
			element.displayInfo();

		}
		System.out.println("-----3rd way----");

		Iterator<Phone> phoneIterator = phoneList.iterator();

//		Phone firstPhone = phoneIterator.next(); // first element of the list
//		firstPhone.displayInfo();
//
//		Phone secondPhone = phoneIterator.next();
//		secondPhone.displayInfo();

		while(phoneIterator.hasNext()) {
		Phone phone=phoneIterator.next();
		phone.displayInfo();
	}

	System.out.println("---Remove SmartPhones from the List----");	
		Iterator<Phone>it= phoneList.iterator();
		
		while(it.hasNext()) {
			Phone phone=it.next();
			if(phone instanceof SmartPhone) {
			it.next();
			it.remove();
			}
		}
		System.out.println(phoneList.size());
		
		for(int i=0;i<phoneList.size(); i++) {
			Phone phone=phoneList.get(i);
			phone.displayInfo();
		}
		
		
		
		
		
	}

}
