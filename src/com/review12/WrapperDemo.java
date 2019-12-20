package com.review12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class WrapperDemo {
	public static void main(String[] args) {
		//variable type <---int-Integer--->Object class
		//double-Double
	
		//Boxing
		Integer i=new Integer(3);
		
		//auto boxing
		Integer i2=5;
		
		//un boxing
		int primitiveInt1=i.intValue();
		
		//auto unboxing
		int primitiveInt2=i2;
		
	
		List<Integer> integers = new LinkedList<>();
		//integers.add("bla bla"); we can not add string value in the integer list
		
		integers.add(new Integer(5));
		integers.add(4);
		integers.add(5);
		integers.add(2);
		
		integers.remove(1);
		System.out.println(integers.size());
		
		
		System.out.println("=== LIST EXAMPLE====");
		Iterator<Integer> iterator=integers.iterator();
		while(iterator.hasNext()) {
			//at the same time we are auto unboxing
			int el= iterator.next();
			System.out.println(el);
		}
		
		System.out.println("=== SET EXAMPLE====");
		Set<Integer> integerSet=new HashSet<>();
		
		integerSet.add(5);
		integerSet.add(4);
		integerSet.add(5);
		integerSet.add(2);
		integerSet.remove(4); // there is not index in SET, 
		Iterator<Integer> iteratorSet=integerSet.iterator();
		while(iteratorSet.hasNext()) {
			//at the same time we are auto unboxing
			int el= iteratorSet.next();
			System.out.println(el);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
