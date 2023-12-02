package OOPConcept.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String,String>();
		
		map.put("FirstName", "Raman");
		map.put("LastName", "Sahoo");
		map.put("FirstName", "Rahul");
		
		System.out.println(map);
		System.out.println(map.get("FirstName"));

		System.out.println(map.get("FirstName")); // Map don't accept the duplicate value it will override the previous value
		
		Set<String> key = map.keySet();
		
		for(String keys:key) {
			System.out.println("Key--> " + keys + " Value is -->"+ map.get(keys));
		}
	}

}
