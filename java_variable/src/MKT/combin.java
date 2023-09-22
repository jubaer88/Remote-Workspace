package MKT;

public class combin {
	public static void main(String[] args) {
		String name1= "moahmmad";
		String name2="hosen";
		StringBuilder result= new StringBuilder();
	int maxln=	name1.length()+name2.length();
		for(int i=0;i<maxln;i++) {
			if(i<name1.length()) {
				result.append(name1.charAt(i));
				System.out.println();
			}
			if(i<name2.length()) {
				result.append(name2.charAt(i));
			}
			
		}
		System.out.println(result.toString());
	}

}


