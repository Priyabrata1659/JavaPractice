package Programming;

public class StringRevers {

	//WAPT reverse the given string
	public static void main(String[] args) {
		
		/* Without using inbuilt method */
		
		String inputString = "Bharat";
		
		char[] ch = inputString.toCharArray();
		int length = ch.length;
//		
//		System.out.println("String length is: " +length);
//		
//		for(int i= length-1; i>=0; i--) {
//			System.out.print(ch[i]);
//		}

		/* With third variable */
		
//		String rev = "";
//		
//		for(int i= length-1; i>=0; i--) {
//			rev = rev+inputString.charAt(i);
//		}
//		
//		System.out.print(rev);
		
		/* With using of StringBuffer */
		
//		StringBuffer sb = new StringBuffer(inputString);
//		System.out.println(sb.reverse());
		
		/* With using StringBuilder */
		
		StringBuilder sbuilder = new StringBuilder(inputString);
		System.out.println(sbuilder.reverse());
	}

}