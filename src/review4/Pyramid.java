package review4;

public class Pyramid {

	public static void main(String[] args) {
		System.out.println("1");
System.out.println("12");	
System.out.println("123");
System.out.println("1234");
	System.out.println("12345");
	System.out.println("++++++++++++++++++");
	
	
	
	for(int row=1; row<=5; row++) {
//		System.out.println(row);
		for(int col=1; col<=row; col++ ) {
			System.out.print(col);
		}
		System.out.println();
	}
	
	System.out.println("++++++++++++++++++");
	
	for(int row=1; row<=5; row++) {
//		System.out.println(row);
		for(int col=1; col<=row; col++ ) {
			System.out.print(2*col-1);
		}
		System.out.println();
	}
	
	System.out.println("++++++++++++++++++");
	
	for(int row=1; row<=5; row++) {
//		System.out.println(row);
		for(int col=1; col<=row; col++ ) {
			System.out.print(col*col+" ");
		}
		System.out.println();
	}
	
	System.out.println("++++++++++++++++++");
	
	
	
	}

}
