package MKT;

import java.util.Scanner;

public class Age_check {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("enter your age: ");
	   int age= scanner.nextInt();
	   if(age>=18) {
		   System.out.println("go to google.com");
	   }else{
		    throw new ArithmeticException("Age is less than 18.");
	   }

	}

}
