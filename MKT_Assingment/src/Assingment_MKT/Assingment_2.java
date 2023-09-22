package Assingment_MKT;

public class Assingment_2 {
	public static void main(String[] args) {


		String name1 ="Ram";
		String name2 ="Sita";
		char gender1= 'M';
		char gender2='F';
		int a=6;
		int b=10;
		if((name1=="Sita" && gender1=='F')){
			System.out.println("Student1");

		}


		if((name2=="Sita"||gender2=='F')) {
			System.out.println("student2");
		}

		if((a>5||b==a)) {
			System.out.println("student3");
		}


		if((a==b&& b==6)) {
			System.out.println("student4");
		}


		if(!(a>5||b==a)) {
			System.out.println("student5");
		}


		if(!(a==b&& b==6)) {// a is False and b also False that's why (!) became True.that's why it's executed.
			System.out.println("student6");
		}




	}
}
