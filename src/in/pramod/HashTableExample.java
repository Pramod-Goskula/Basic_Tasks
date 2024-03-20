package in.pramod;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<String, Integer> ht= new  Hashtable<String, Integer>();
		
		ht.put("Pramod", 22);
		ht.put("kalyan", 21);
		ht.put("srikanth", 23);
		ht.put("praveen",200);
		ht.put("DharmaSir", 330);
		System.out.println(ht);
		Enumeration e=ht.keys();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
