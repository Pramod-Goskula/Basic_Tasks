package in.pramod;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(29);
		lhs.add(21);
		lhs.add(null);
		lhs.add(8);
		lhs.add(23);
		
		System.out.println(lhs);
		System.out.println("---------------------");
		System.out.println(lhs.size());
		System.out.println("---------------------");
		
		for(Integer e:lhs) {
			System.out.println(e);
			
		}
		System.out.println("---------------------");
		Iterator it=lhs.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}


	}


