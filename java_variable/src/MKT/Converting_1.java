package MKT;

public class Converting_1 {

	public static void main(String[] args) {
		int a=85;
		double a1=a; //implicitly;
		System.out.println(a1);
		
		double b=85.7;
		int b1=(int)b;//explicitly;
		System.out.println(b1);
		byte c= 1;
		long c1=c;
		System.out.println(c1);
		//note: can't do convert byte to long;
		//long c2= 347833384;
		//byte c3=c2;
		//System.out.println(c3);

	}

}
