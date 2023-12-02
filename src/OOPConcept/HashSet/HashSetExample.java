package OOPConcept.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();

		set.add("Raman");
		set.add("Vicky");
		set.add("Raman");
		set.add("Josh");
		
		//It only allows unique value
		
		Set<String> st = new HashSet<String>();
		
		System.out.println(set); // We can not fatch the value in hashset by using get method as the order is not in sequence
		
		for(String ha: set) {
			System.out.println(ha);
		}
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
