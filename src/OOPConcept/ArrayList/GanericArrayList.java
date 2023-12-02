package OOPConcept.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GanericArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		//list.add(22.02); This will accept only the Integer values
		
		int i = list.get(0);
		System.out.println(i);
		

	}

}
