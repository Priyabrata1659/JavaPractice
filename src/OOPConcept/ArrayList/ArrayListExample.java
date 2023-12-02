package OOPConcept.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		
		list.size();
		
		list.add(10); // Here value of 10 is a object
		list.add("Vicky");
		list.add(10.25);
		list.add('c');
		list.add(10);
		list.add(true);
		
		System.out.println(list); //It will mentain the sequence, store null value and accept duplicate values.
		System.out.println(list.size());
		
		//How to fatch the vlues from a list
		
		System.out.println(list.get(0));
		
		//How to remove the values from a list
		
		list.remove(2);
		System.out.println(list);
		
		//How to fatch the value from a ArrayList
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Object var:list) {
			System.out.println(var);
		}
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}
