package in.pramod;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<>();
		
		hm.put(9, "Pramod");
		hm.put(14, "Java");
		hm.put(12, "Developer");
		System.out.println(hm);
		System.out.println(hm.size());
		
		Set<Integer> s=hm.keySet();
		System.out.println(s);
		
		Collection<String> c=hm.values();
		System.out.println(c);
		
		Set<?> entry= hm.entrySet();
		System.out.println(entry);
		
		System.out.println(hm.containsKey(12));
		
		System.out.println(hm);
		
	}

}
