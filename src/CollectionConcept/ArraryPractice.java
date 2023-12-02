package CollectionConcept;

public class ArraryPractice {

	public static void main(String[] args) {
		
		//array: to store similar data type values in a array variable
		
		//1. int array;
		//Lowest bound/index is zero;
		//Upper bound/index is n-1(n is size of array)
		
		//Dis-advantage of array:
		//1. Size is fixed -- static array -- To overcome this problem -- we use collection -- ArrayList, HashTable .....
		//2. Stores only similar data types -- To overcome of this problem, we use object array.
		
		int i[] = new int[4];
		String s[] = new String[5];
		
		s[0] = "S";
		s[1] = "p";
		s[2] = "r";
		s[3] = "8";
		s[4] = "9";
		
		
		//System.out.println(s[6]); //ArrayIndexOutOfBoundsException
		//If we try to print value greater then index of (n-1) we will get //ArrayIndexOutOfBoundsException
		
		for(int k=0;k<s.length; k++) {
			System.out.println(s[k]);
		}
		
		Object ob[] = new Object[4]; //Object array is used to store different data type values
		ob[0] = "23";
		ob[1] = 12;
		ob[2] = 81;
		ob[3] = 23.312;
		
		int j[] = new int[] {30,20,33,87};
		
		for(int o=0;o<j.length; o++) {
			System.out.println(j[o]);
		}

	}
	
	

}
