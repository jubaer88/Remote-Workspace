package MKT;

public class days_14 {
	static String name="AMERICA";
	static String text="MY name Is Mohammad";
	 static String a = "leela";
	 static String b ="sai";
	 
	public static void vartial_output () {
		for(int i=0;i<name.length();i++) {
			name.charAt(i);
			System.out.println(name.charAt(i));
	}
	}
	public static void revers_output () {
		StringBuilder reversedName = new StringBuilder(name);
		reversedName.reverse();
		String rev= reversedName.toString();
		System.out.println(rev);
	}
	public static void splite_text() {
	     String[] words = text.split(" ");
	        
	        for (String word : words) {
	            System.out.println(word);
	        }
	    }
	public static void concat_text() {
		  
        // Create a StringBuilder and append the reversed strings
        StringBuilder reversed = new StringBuilder();
        reversed.append(new StringBuilder(a).reverse());
        reversed.append(new StringBuilder(b).reverse());
        
        // Convert the StringBuilder back to a string
        String result = reversed.toString();
        
        // Print the result
        System.out.println(result);
	       
	       
	    }
	
	public static void main(String[] args) {
		vartial_output ();
		revers_output ();
		splite_text();
		concat_text();
		}

	}


