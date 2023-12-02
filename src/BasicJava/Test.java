package BasicJava;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(2);
		arr.add(1);
		arr.add(2);
		arr.add(4);
		
		int count=0;
		
		for(int i=0; i<arr.size(); i++) {
			int value =arr.get(i);
			if(value%2==0)
				count++;
		}
		System.out.println(count);
		}

	

}
