package MKT;

import javax.annotation.processing.FilerException;

public class Mulit_ExceptionHandling {

	public static void main(String[] args) throws FilerException {
		try {
			int b =1/0;
			System.out.println("Its handel");
		} catch (ArithmeticException e) {
			System.out.println("Its handel");
			
			
			
		}

	}

}
