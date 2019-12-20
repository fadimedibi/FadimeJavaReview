package com.review11;


	public class Albanian1 extends Human1{
		String albanianId;
			public Albanian1() {
					}
			public Albanian1(String name, int age, int weight, String albanianId) {
				super(name, age, weight);
				this.albanianId = albanianId;
			}
			@Override
			public String greeting() {
				return "Pershendetje!";
			}
			@Override
			public void talk() {
				System.out.println("Une flas shqip. Une quhen " + name);
			}
			
			public void albanianDance() {
				System.out.println("Dancing like an albanian.");
			}
}
