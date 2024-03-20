package in.pramod;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(20);
		hs.add(25);
		hs.add(9);
		hs.add(null);
		hs.add(15);
		hs.add(6);
		
		System.out.println(hs);
		System.out.println("---------------------");
		System.out.println(hs.size());
		System.out.println("---------------------");
		
		for(Integer e:hs) {
			System.out.println(e);
			
		}
		System.out.println("---------------------");
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
