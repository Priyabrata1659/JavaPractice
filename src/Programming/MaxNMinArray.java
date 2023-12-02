package Programming;

public class MaxNMinArray {

	public static void main(String[] args) {
		int a[] = new int[] {2,9,6,10,73,1};
		
//		int max=a[0];
//		for(int i=1; i<a.length; i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		System.out.println(max);
		
		int min=a[0];
		for(int i=1; i<a.length; i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}