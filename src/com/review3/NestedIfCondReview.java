package com.review3;
import java.util.Scanner;

public class NestedIfCondReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * Create a Java program that will ask if user has a credit card or 
        not. If you
         * user does not have a credit card then offer them. If they do have 
        one ask
         * what is balance on the card? If balance of the card is larger than 
        1000, tell
         * them to pay off otherwise you can tell them that they can spend more
         */
        
//		Scanner input = new Scanner(System.in);
//		System.out.println("Do you have a credit card? true or false");
//		boolean cc = input.nextBoolean();
//		if (cc == true)
//
//		{
//			System.out.println("What is the balance on your card?");
//			int balance = input.nextInt();
//			if (balance > 1000) {
//				System.out.println("Please pay off your balance");
//			} else {
//				System.out.println("You can spend more money");
//			}
//   
//      }else {
////      System.out.println("Would you like to apply for credit card");
//      }
		
		 //Write a program with one int value for salary and four String values for different cars
        //If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car. For those you can afford a new car there are different price ranges
        //I want anything under 70k to be Audi A5
        //I want anything under 80k to be Mercedes-Benz
        //I want anything under 90k to be Jaguar
        //I want anything under 100k to be Tesla
        // And if you make less than 60k output to read "Save up money and wait until next year"


int salary=90000;
String audi,merc,jag,tes;
if(salary>50000) {
	System.out.println("I will buy new car");
	if(salary<70000){
		System.out.println("I want an Audi A5");
	}else if(salary<80000) {
		System.out.println("I want Mercedes");
	}else if(salary<90000) {
		System.out.println("I want Jaguar");
	}else if(salary<100000) {
		System.out.println("I want Tesla");
	}else if(salary<60000) {
		System.out.println("Save up money and wait until next year");
	}
		
	}else {
		System.out.println("I will buy used car");
	}


}
}

//int salary = 65000;
//String a="Audi A5";
//       String b="Mercedes-Benz";
//String c="Jaguar";
//String d="Tesla";
//
//if(salary>50000) {
//    if(salary>=60000) {
//        System.out.println("With this salary you afford "+a);
//    }
//    else if (salary>=70000) {
//        System.out.println("With this salary you afford "+b);
//    }
//    else if (salary>=80000) {
//        System.out.println("With this salary you afford "+c);
//    } 
//    else if (salary>=90000) {
//        System.out.println("With this salary you afford "+d);
//    }
//    else {
//        System.out.println("Save up money and wait until next year");
//    }
//} else  {
//System.out.println("Sorry unfortunately you might want to buy a use car instead");
//}	

