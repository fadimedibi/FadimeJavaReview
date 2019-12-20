package com.review13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Student student1 = new Student(1234, 18, "John");

//		ArrayList<Student> studentList = new ArrayList<>();
//
//		Student student2 = new Student(1234, 18, "John Smith");
//		studentList.add(student2);
//		studentList.add(new Student(2345, 18, "Adam Smith"));
//		studentList.add(new Student(3456, 19, "Mary Lamb"));
//		studentList.add(new Student(4567, 19, "Sasha kallasnikov"));
//		studentList.add(2, new Student(5678, 17, "gavkhar Koka"));
//
//		System.out.println(studentList);
//		
//		//How to find the student with number 3456 ----- with loop and if 
//		Iterator<Student> it=studentList.iterator();
//		while(it.hasNext()) {
//		Student student=	it.next();
//		if(student.studentNumber==3456) {
//			student.displayInfo();
//			break;
//		}
//		}

		Map<Integer, Student> studentMap = new HashMap<>();
		Student student3 = new Student(1234, 18, "John Smith");
		studentMap.put(1234, student3);
		studentMap.put(2345, new Student(2345, 18, "Adam Smith"));
		studentMap.put(3456, new Student(3456, 19, "Mary Lamb"));
		studentMap.put(4567, new Student(4567, 19, "Sasha kallasnikov"));

		System.out.println(studentMap);
		System.out.println(studentMap.get(3456));
		studentMap.get(3456).displayInfo();

		studentMap.keySet();
		System.out.println("----Getting keys-----------");
		Set<Integer> keys = studentMap.keySet();

		Iterator<Integer> keyIterator = keys.iterator();

		while (keyIterator.hasNext()) {
			int key = keyIterator.next();
			Student student = studentMap.get(key);
			System.out.println(student);
			// OR System.out.println(key+"---->"+ studentMap.get(key));
		}

		System.out.println("---------getting values--------");
		Collection<Student> valueCollection = studentMap.values();

		Iterator<Student> studentIterator = valueCollection.iterator();
		while (studentIterator.hasNext()) {
			Student student = studentIterator.next();
			System.out.println(student);
			// student.displayInfo();
		}

		System.out.println("----getting entries-----");
		// one entry is one pair. in our case a pair of Integer and Student
		Collection<Entry<Integer, Student>> entries = studentMap.entrySet();
		// System.out.println(entries);

		Iterator<Entry<Integer, Student>> entryIterator = entries.iterator();
//		Entry<Integer, Student> firstPair=entryIterator.next();
//		System.out.println(firstPair);

		while (entryIterator.hasNext()) {
			Entry<Integer, Student> pair = entryIterator.next();
			int key = (int) pair.getKey();
			Student student = pair.getValue();
			System.out.println(key + "----> " + student);
		}

	}

}
