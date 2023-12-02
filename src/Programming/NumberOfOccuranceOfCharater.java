package Programming;


public class NumberOfOccuranceOfCharater {
	
	
	public static void getNumberOfOccurance(String str, char val) {
		int count = 0;
		for(char ch:str.toCharArray()) {
			if(ch == val) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		String str = "You know what you are";
		getNumberOfOccurance(str, 'o');

	}

}
