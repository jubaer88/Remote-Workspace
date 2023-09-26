package Assingment_MKT;

class Addition {
    public double add(double num1, double num2) {
        return num1 + num2;
    }
}

class Subtraction {
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplication {
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
}

class Division {
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
    }
}
public class Assingment_30Arithme {

 public static void main(String[] args) {
	   double operand1 = 10.0;
       double operand2 = 5.0;
     Addition addObj = new Addition();
     Subtraction subtractObj = new Subtraction();
     Multiplication multiplyObj = new Multiplication();
     Division divideObj = new Division();

     double resultAdd = addObj.add(operand1, operand2);
     double resultSubtract = subtractObj.subtract(operand1, operand2);
     double resultMultiply = multiplyObj.multiply(operand1, operand2);
     double resultDivide = divideObj.divide(operand1, operand2);

     System.out.println("Addition: " + resultAdd);
     System.out.println("Subtraction: " + resultSubtract);
     System.out.println("Multiplication: " + resultMultiply);
     System.out.println("Division: " + resultDivide);
	
	
}
}
