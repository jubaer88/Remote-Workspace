package MKT;

public class singelException_hendaling {

	public static void main(String[] args) {
	
		try {
		int c=1/1;
		System.out.println(c);
		}catch(ArithmeticException a){
			System.out.println("excetion handaling is done");
		}
		catch(NullPointerException a1){
			System.out.println("excetion handaling ");
		}
		finally {  
			System.out.println("this is the end of the program");
		}
	}

}

