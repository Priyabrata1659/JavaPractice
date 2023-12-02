package Programming;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] arr = {35, 35, 35, 35, 33};
		int n = arr.length;
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
	
		for(int i=0; i<n; i++) {
			 if(arr[i]>largest) {
				 secondLargest = largest;
				 largest= arr[i];
			 }
			 
			 if(arr[i] < largest && arr[i] > secondLargest ) {
				 secondLargest = arr[i];
			 }
			 
		}
		System.out.println(secondLargest);
	}

	

}
