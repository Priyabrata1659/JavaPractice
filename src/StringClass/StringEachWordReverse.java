package StringClass;

public class StringEachWordReverse {

	public static void main(String[] args) {
		
		String st = "Lets test the java program";
		String[] words = st.split(" ");
		String revString = "";
		
		for(int i=0; i<words.length;  i++) {
			String newWord = words[i];
			String revWord = "";
			
				for(int j=newWord.length()-1; j>=0; j--) {
					revWord = revWord + newWord.charAt(j); 	
				}
				revString = revString + revWord + " " ;
				
		}
		System.out.println(revString.trim());
		
	}
	

}
