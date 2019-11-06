package com.review4;

import java.util.Scanner;

public class ScannerWhileDo {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
int pay;
do {
	System.out.println("Please pay for candy");
	pay=scan.nextInt();
}while(pay!=3);
	System.out.println("Enjoy your candy");
}
	}

