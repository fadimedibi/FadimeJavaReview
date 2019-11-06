package com.review5IMissed;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		//1D Array
		int[]a=new int[4];
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
			System.out.println("***************");
		//2D Array	
			int[][]b=new int[3][4];
			
			b[1][2]=3;
			b[2][1]=5;
			
			for(int row=0; row<b.length; row++) {
				System.out.print("row "+row+" -> ");
				for(int col1=0; col1<b[row].length; col1++){
					int value=b[row][col1];
					
					System.out.print(value+" ");
							
				}
				
				System.out.println();
			}
			
		
	}
}

