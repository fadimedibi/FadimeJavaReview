package com.review5IMissed;

import java.util.Scanner;

public class Scanner2DArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in); 
System.out.println("Hey how many rows do you need?");
int row=scan.nextInt();
System.out.println("Hey how many columns do you need?");
	int col=scan.nextInt();
	System.out.println("your array will have "+row+" rows and "+col+" columns" );
	
	String[][] names=new String [row][col];
//	for(int i=0; i<names.length; i++) {
//		for(int j=0; j<names[i].length; j++) {
//			System.out.println("Please enter the names:");
//			names[i][j]=scan.next();
//		}
//	}
	for(int i=0; i<names.length; i++) {
		for(int j=0;j<names[i].length; j++) {
			
			System.out.print(names[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	
}
}
