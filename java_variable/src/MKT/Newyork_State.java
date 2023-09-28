package MKT;
//upcasting;

class America{
	void Highway() {
		System.out.println("Interstate south 95");
	}
void Railway() {
		System.out.println("MTRACK");
	}
	
}
public class Newyork_State extends America{
	void vanwyck_exp() {
		System.out.println("all the time trafic");
	}
	public static void main(String[] args) {
		America a=new Newyork_State();// implicitly upcasting;
		
		America a1=(America )new Newyork_State();//explicitly upcasting;
		a.Highway();
		a.Railway();
		a1.Highway();
		a1.Railway();
	}

}
