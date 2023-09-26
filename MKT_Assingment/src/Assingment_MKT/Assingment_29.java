package Assingment_MKT;

import java.util.Scanner;

public class Assingment_29 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input first number
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        // Input second number
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        // Perform arithmetic operations
	        double sum = num1 + num2;
	        double difference = num1 - num2;
	        double product = num1 * num2;

	        // Check if the second number is not zero before performing division
	        double quotient = (num2 != 0) ? (num1 / num2) : Double.POSITIVE_INFINITY;

	        // Check if the second number is not zero before performing modulus
	        double modulus = (num2 != 0) ? (num1 % num2) : Double.NaN;

	        // Display results
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        System.out.println("Quotient: " + quotient);
	        System.out.println("Modulus: " + modulus);

	        scanner.close();
	    }
}
