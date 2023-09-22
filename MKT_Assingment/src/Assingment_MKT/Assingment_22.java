package Assingment_MKT;
public class Assingment_22 {

	//static fashion;
	 static int a=30;
	 static int b=40;
	 static String name = "Mohammad Hosen";  
	 

	public void My1() 
	{	
		int c=a+b;
		System.out.println("name is "+name);
		System.out.println("age is "+c);
	
	
	}
	public static void My2() {
		int c=a+b;
		System.out.println("name is "+name);
		System.out.println("age is "+c);
	
	
	}
	
	public void Final()
	{
		 int a=100;
		a=300;
	}
	
	public static void main(String[] args) {
		//non static method call by creating referral name;
		Assingment_22 behavior= new Assingment_22();
		//non static variable update ;
		a=2;// while we update vale ,its't take only update vale
		b=30;
		//method call by create object;
		behavior.My1();
		//a=30;
		//b=30;
		name="Hosen";
		My2();
	}



}
