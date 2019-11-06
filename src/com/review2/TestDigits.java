package com.review2;

public class TestDigits {
public static void main(String[] args) {
	int num=756;
	if (num < 100) {
        if (num >= 10) {
            System.out.println("it is two digit number");
        }
    } else if (num < 1000) {
        if (num >= 100) {
            System.out.println("it is three digit number");
        }
    } else if (num < 10000) {
        if(num >= 1000) {
            System.out.println("it is four digit number");
        }
    } else if (num < 100000) {
        if(num >= 10000) {
            System.out.println("it is five digit number");
        }
    } else {
        System.out.println("number is not between 1 & 99999");
    }
}
}
