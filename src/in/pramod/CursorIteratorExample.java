package in.pramod;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorIteratorExample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Pramod");
		al.add("G");
		al.add("Java");
		al.add("Developer");
		System.out.println(al);
		Iterator<String> i= al.iterator();
		while(i.hasNext()) {
			String next=i.next();
			System.out.println(next);
		}

	}

}
