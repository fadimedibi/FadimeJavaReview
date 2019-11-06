
public class ArithmethicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ex  Class notes.
        /* if number is between 1-10 -->this number is small
         * if number is between 10-100 --> this number is medium
         * if number is between 100-1000 --> this number is large
         * any other number --> is out of the range
         */
      int num=200;
//            true AND false --> false
      if (num>1 && num <10) {
      System.out.println("this number is small");
      // true AND false --> false
      }else if (num>=10 && num<100) {
      System.out.println("this number is medium");
      //true AND true --> true
      }else if (num>=100 && num <1000) {
      System.out.println("this number is large");
      }else {
      System.out.println("Number is out of our the range");
      }

    //Write a program to find if a number is even or odd 
      //Print out  "My number must be even" or "My number must be odd" 
       // Must use if else

int number=35;

if(number%2==0) {
	System.out.println("Number is even");
}else {
	System.out.println("Number is odd");
}


//Write a program to find if the largest Number of three numbers
//Print out  System.out.println("Largest number is " + largestNumber);
 // Must use if then a else if and lastly else 

int n1=1;
int n2=12;
int n3=9;

if(n1>n2 && n1>n3) {
	System.out.println("n1 is the greatest");
}else if (n2>n1 && n2>n3) {
		System.out.println("n2 is the greatest");
	
	
}else 
System.out.println("n3 is the greatest");
	}
}


