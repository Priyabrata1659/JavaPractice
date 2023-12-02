package Array;

public class Array1D {

	public static void main(String[] args) {
		int[] arr = new int[6];
		int[] arry = {65,73,21,93,83};
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		
		System.out.println(arry[3]);
		
		//Reverse arry
		for(int i=0; i<arry.length; i++) {
			System.out.println(arry[i]);
		}
		
		//Print all value in array
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}

}
