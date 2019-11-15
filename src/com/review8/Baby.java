package com.review8;

public class Baby {
String firstName;
String lastName;
char gender;
int weight;
String hairColor;


void walk(int times) {
	for(int i=0; i<times; i++) {
	System.out.println("bla bla bla");
}
}
void crawl() {
	System.out.println("Crawl");
}
void cry() {
	System.out.println("Cry every minute");
}

void displayBabyInfo() {
	System.out.println("Full name of baby 2 "+firstName+" "+lastName);
	System.out.println("Gender is "+ gender);
	if(gender=='F') {
		System.out.println("Girl");
	}else if(gender=='M') {
		System.out.println("Boy");
	}else {
		System.out.println("unknown gender");
	}
	System.out.println(hairColor);

}


}
