package Assingment_MKT;

public class Assingment_28 {
	  // Declare a final variable for Pi
    final double PI = 3.14159;

    // Method to calculate the area of a circle
    public double calculateArea(double radius ) {
        // Use the final variable PI in the calculation
        double area = PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
    	Assingment_28 calculator = new Assingment_28();
    	calculator.calculateArea(0);
    	System.out.println(calculator.calculateArea(24));
    }
}
   


