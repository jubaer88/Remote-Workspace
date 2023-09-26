package MKT;

public class Array_Exception {

	public static void main(String[] args) {
	String name  []= new String [3];
		name[0]="Mohammad";
		name[1]="Mohammad";
		name[2]="Mohammad";	
		try {
		name[3]="Mohammad";	
	}
	catch(ArrayIndexOutOfBoundsException a) {
	}	System.out.println("handaled by acception");
	}
	
}
