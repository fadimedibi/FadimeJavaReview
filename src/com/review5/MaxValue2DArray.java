package com.review5;

public class MaxValue2DArray {

	public static void main(String[] args) {
		int[][] b = { 
                { 2, 3, 5 }, 
                { 2, 4, 7 }, 
                { 8, 1, 9 }, 
                { 3, 5, 1 } 
        };
		int sum=0;
		int max=b[0][0];
		for(int i=0; i<b.length; i++ ) {
			for(int k=0; k<b[i].length; k++) {
				sum+=b[i][k];
				if(b[i][k]>max) {
				max=b[i][k];
				}
			}
		}
		System.out.println("maximum number is "+max);
		System.out.println("sum is "+sum);
	}

}
