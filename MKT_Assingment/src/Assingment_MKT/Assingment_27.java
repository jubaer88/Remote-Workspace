package Assingment_MKT;

public class Assingment_27 {

    // Declaring a final global variable
    final static int Global  = 100;

    public static void main(String[] args) {
        System.out.println("Initial value of GLOBAL_CONSTANT: " +Global );

        // Attempting to update a final global variable will result in a compilation error
        // Uncommenting the line below will result in a compilation error.
    // GLOBAL_CONSTANT = 200;

        System.out.println("Updated value of GLOBAL_CONSTANT: " +Global  ); // This line will not be reached due to the error
    }
}
	


