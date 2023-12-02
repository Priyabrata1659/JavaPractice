package Programming;

import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) 
	{
		int arr1[] =  {3, 9, 6, 10, 4, 5, 12} ;
		int arr2[] = {4, 6, 9, 3, 10, 7, 5};
		
		int a = arr1.length;
		int b = arr2.length;
		int c = a+b;
		
		int[] c1 = new int[c];
		
		for(int i=0; i<a; i++) {
			c1[i] = arr1[i];
		}
		
		for(int i=0; i<b; i++) {
			c1[a+i] = arr2[i];
		}
		
		/*
		 * for(int i=0; i<c; i++) { //System.out.println(c1[i]); }
		 */ 
		
		
		HashSet<Integer> st = new HashSet<Integer>();
		
		for(int i=0; i<c1.length; i++) {
			st.add(c1[i]);
		}
		
		for(int t:st) {
			System.out.println(t);
		}
		 
	}

	

}
