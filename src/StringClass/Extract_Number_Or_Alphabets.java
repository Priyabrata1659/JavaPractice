package StringClass;

public class Extract_Number_Or_Alphabets {

	public static void main(String[] args) {
		String str = "Check the 191 and 100 are the emergency number or not";
		
		String str1 = str.replaceAll("[^0-9]"," ");
		
		System.out.print(str1.trim());
 
	}

}
