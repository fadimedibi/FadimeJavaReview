package test;

public class StringBufferDemo {

	public static void main(String[] args) {
	String name="John";
	String name2="John";
	
	String address="Fairfax";
	String address2="Fairfax";

	String a="John";
	String b;
	b=a+"Smith";
	
	
	
	StringBuffer c=new StringBuffer("Smith");
	StringBuffer d=new StringBuffer("Khan");
	
	
	c.append(d);
	
	System.out.println(a);
	System.out.println(c);
	
	StringBuilder cd=new StringBuilder("lkjhgjk");
	
	
	}

}
