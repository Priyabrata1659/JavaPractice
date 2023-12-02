
package Programming;

public class ReverseArray {

	//WAP to print the reversed array without using the inbuilt function
	public static void main(String[] args) {
		int a [] = new int[] {21,20,83,74,55,63};
		
		for(int i=a.length-1;i>=0; i--) {
			System.out.println(a[i]);
		}

	}

}