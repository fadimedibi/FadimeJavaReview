package com.review3;

import java.util.Scanner;

public class NestedIfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Verify if button is displayed on the page
		 * if button is displayed then we need to verify text on
		 * if text equal to sign in --> Test case pass
		 * otherwise --> Wrong text is displayed */
		      boolean isDisplayed=true;
		      String buttonText="Sign In";
		      if (isDisplayed) {
		      System.out.println("Button is displayed");
		           if (buttonText.equals("Sign In")) {
		             System.out.println("Test case pass");
		      }else {
		           System.out.println("Wrong text is displayed");
		      }
		} 
		        else {
		      System.out.println("Button is not displayed");          
		}

		      
		      
		      //Write a program with one int value for salary and four String values for different cars
		        //If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car. For those you can afford a new car there are different price ranges
		        //I want anything under 70k to be Audi A5
		        //I want anything under 80k to be Mercedes-Benz
		        //I want anything under 90k to be Jaguar
		        //I want anything under 100k to be Tesla
		        // And if you make less than 60k output to read "Save up money and wait until next year"

		      int salary;
		        String car1,car2,car3,car4;
		        car1="Audi A5";
		        
		        
		        Scanner scan=new Scanner(System.in);
		        System.out.print("Please enter your annual salary: ");
		        salary=scan.nextInt();
		        scan.close();
		        
		        if (salary<50000) {
		            System.out.println("You should buy a used car");
		        }else {
		            String carMake = null;
					if (salary<60000) {
		                System.out.println("Save up money and wait until next year");
		            }else if (salary>=60000 && salary<70000) {
		            	 System.out.println("You should buy a used car");
		            }else if (salary>=70000 && salary<80000) {
		                carMake="Mercedes-Benz";
		            }else if (salary>=80000 && salary<90000) {
		                carMake="Jaguar";
		            }else if (salary>=90000 && salary<100000) {
		                carMake="Tesla";
		            }
		        System.out.println("I want to buy " + carMake);
		        }
		    }



	}

