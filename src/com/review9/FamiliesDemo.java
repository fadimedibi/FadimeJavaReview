package com.review9;

public class FamiliesDemo {

	public static void main(String[] args) {
	SmithMember member1=new SmithMember();
	
	member1.increment();
	member1.firstName="John";
	member1.lastName="Smith";
	member1.gender='M';
	member1.salary=5000;
	SmithMember.AddIncome(member1.salary);
	
	member1.memberInfo();
	
	SmithMember member2=new SmithMember();
	member2.increment();
	member2.firstName="Jane";
//	member2.lastName="Smith";
	member2.gender='F';
	member2.salary=6000;
	SmithMember.AddIncome(member2.salary);
	member2.memberInfo();
	
	System.out.println("There are "+SmithMember.count+ " members in the "+SmithMember.lastName+" family");
	
//	System.out.println("Last name has been changed to Doe.");
//	member1.lastName="Doe";
//	member1.memberInfo();
//	member2.memberInfo();
	System.out.println("Baby is born");
	SmithMember baby=new SmithMember();
	baby.increment();
	baby.firstName="Adam";
	baby.gender='M';
	baby.salary=500;
	SmithMember.AddIncome(baby.salary);
	
	System.out.println("There are "+member2.count+ " members.");
	System.out.println(SmithMember.lastName+ " family's income is :"+ SmithMember.familyIncome );
	
	System.out.println();
	System.out.println("Let's create \'create \" James Family ");
	
	JamesMember jMember1=new JamesMember();
	jMember1.increment(); //OR    JamesMember.count++; 
	jMember1.firstName="Lebrone";
	JamesMember.lastName="James";
	jMember1.gender='M';
	jMember1.salary=100000;
	JamesMember.AddIncome(jMember1.salary);
	jMember1.memberInfo();
	
	
	JamesMember jMember2=new JamesMember();
	jMember2.increment(); //OR    JamesMember.count++; 
	jMember2.firstName="Savannah";
	JamesMember.lastName="James";
	jMember2.gender='F';
	jMember2.salary=200;
	JamesMember.AddIncome(jMember2.salary);
	jMember2.memberInfo();
	
	
	System.out.println("There are "+JamesMember.count+ " members in the " +JamesMember.lastName+" family");
	System.out.println(JamesMember.lastName+ " family's income is :"+ JamesMember.familyIncome );
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
