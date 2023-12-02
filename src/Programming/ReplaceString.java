package Programming;

public class ReplaceString {

	public static void main(String[] args) {
		
		String word = "He is a gold medalist";
		
		String rWord = word.replace("is", "was");         //He was a gold medalwast
		String rWord1 = word.replaceFirst("is", "was");   //He was a gold medalist
		String rWord2 = word.replaceAll("is", "was");     //He was a gold medalwast
		String rWord3 = word.replaceAll("is(.)", "was");  //He wasa gold medalwas
		String rWord4 = word.replaceAll("is(.*)", "was"); //He was
		
		System.out.println(rWord);
		

	}

}