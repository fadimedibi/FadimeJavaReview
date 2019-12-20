package com.review13;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {

		Student[] studentArray = new Student[3];
		Student student1 = new Student(1234, 18, "John Smith");
		studentArray[0] = student1;
		studentArray[1] = new Student(2345, 19, "James White");
		studentArray[2] = new Student(3456, 19, "Mary Lamb");
//	studentArray[3]=new Student(4567, 19,"Sasha kallasnikov");

		// create a new array with more size/space
		Student[] studentArrayNew = new Student[6];
		studentArrayNew[0] = studentArray[0];
		studentArrayNew[1] = studentArray[1];
		studentArrayNew[2] = studentArray[2];
		studentArrayNew[3] = new Student(4567, 19, "Sasha kallasnikov");

		for (int i = 0; i < studentArray.length; i++) {
			studentArrayNew[i] = studentArray[i];
		}

		System.out.println("Same thing done easier with a collection");
		ArrayList<Student> studentList = new ArrayList<>();
		System.out.println(studentList.size());
		Student student2 = new Student(1234, 18, "John Smith");
		studentList.add(student2);
		studentList.add(new Student(2345, 18, "Adam Smith"));
		studentList.add(new Student(3456, 19, "Mary Lamb"));
		studentList.add(new Student(4567, 19, "Sasha kallasnikov"));
		studentList.add(2, new Student(5678, 17, " gavkhar Koka"));

		System.out.println(studentList.size());

		System.out.println("-------Using enhanced for loop----");
		for (Student student : studentList) {

			student.displayInfo();
		}
		System.out.println("-------Using iteartor----");

		Iterator<Student> studentIterator = studentList.iterator();
		// while(studentIterator.hasNext()) {
		Student s1 = studentIterator.next();
		s1.displayInfo();

		Student s2 = studentIterator.next();
		s2.displayInfo();
		// I got another one
		Iterator<Student> studentIterator2 = studentList.iterator();
		if (studentIterator.hasNext()) {
			studentIterator.next().displayInfo();
		}

		if (studentIterator.hasNext()) {
			Student s5 = studentIterator.next();
		}
		// Using Iterator2
		while (studentIterator2.hasNext()) {
			Student student = studentIterator2.next();
			student.displayInfo();
		}

	}

}

class Student {
	int studentNumber;
	int age;
	String name;

	public Student(int studentNumber, int age, String name) {
		this.studentNumber = studentNumber;
		this.age = age;
		this.name = name;

	}

	public void displayInfo() {
		System.out.println("Student name " + name + " age " + age + " student number " + studentNumber);
	}

	public String toString() {
		return name + " " + age + " " + studentNumber;
	}
}
