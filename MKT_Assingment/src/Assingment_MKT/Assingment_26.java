package Assingment_MKT;

public class Assingment_26 {

	// Static Initialization block;
	static {
		System.out.println("i am static block");
	}
	
	static {
		System.out.println("i am static block2");
	}
	
	// Instance initialization block;
	
	{
		
		System.out.println("i am the instance block");
	}
	{
		System.out.println("i am the instance block2");
	}
	
	//Constructor 
	Assingment_26 (){
		 
		 System.out.println("i am constractor");
	 }
	Assingment_26 (int a){
		 
		 System.out.println("i am constractor2");
	 }
	
		// Main Method;
		  public static void main(String[] args) {
		  System.out.println("i am the Mian method");
		  
			
			  new Assingment_26  ();
			  new Assingment_26 (10);
			 
		  
		  
		  
		  }
	


}
