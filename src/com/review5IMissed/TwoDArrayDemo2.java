package com.review5IMissed;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {
		int[][]b= {
				{7,3,5},
				{9,4,2,6},
				{8,1,0,3,4},
				{3,5,1}
		};
		
//		System.out.println(b.length);
//		System.out.println(b[0].length);
//		System.out.println(b[1].length);
//		System.out.println(b[2].length);
//		System.out.println(b[3].length);
		
for(int i=0; i<b.length; i++) {
	for( int j=0; j<b[i].length; j++) {
		if(j==1) {
		
		}else {
			if(i==1 || i==3) {
				
			}else {
				System.out.print(b[i][j]+" ");
		
			}
		}
	
	}System.out.println();
}

	}}