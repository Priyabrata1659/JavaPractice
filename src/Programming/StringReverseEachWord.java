package Programming;

public class StringReverseEachWord {

	public static void main(String[] args) {
		String str = "Java Program An amezing check";
		
		String[] words = str.split(" ");
		String revString= " ";
		
		for(int i=0; i<words.length; i++) {
			String newWord = words[i];
			String revWord = "";
			if(i==0 || i%2==0) 
			
			for(int j=newWord.length()-1; j>=0; j--) 
			{
				revWord = revWord+ newWord.charAt(j);
			}
			
			revString = revString + revWord + " ";
			
		}

		System.out.println(revString.trim());
	}

}
