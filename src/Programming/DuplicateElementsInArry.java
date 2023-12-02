package Programming;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArry {

	public static void main(String[] args) {
		/*
		 * String arr[] = {"Java", "Python", "Ruby", "Java", "Python"};
		 * 
		 * for(int i=0; i<arr.length;i++) { for(int j=i+1; j<arr.length;j++) {
		 * if(arr[i]==arr[j]) { System.out.println("The duplicate value is: " + arr[i]);
		 * } } }
		 */
		/*
		 * int arr[] = { 23, 43, 76, 23, 43 };
		 * 
		 * for (int i = 0; i < arr.length; i++) { for (int j = i + 1; j < arr.length;
		 * j++) { if (arr[i] == arr[j]) { System.out.println("The duplicate value is: "
		 * + arr[i]); } } }
		 */
		
		String arr[] = {"Java", "Python", "Ruby", "Java", "Python"};
		
		Set<String> st = new HashSet<String>();
		for(String e : arr) {
			if(st.add(e)==false) {
				System.out.println("The duplicate value is: " + e);
			}
		}

	}

}
