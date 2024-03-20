package in.pramod;

import java.util.ArrayList;

public class CollectionArrayListExample {
	
	public static void main(String args[]) {
		ArrayList al=new ArrayList();
		
		al.add("Pramod");
		al.add(5023);
		al.add(2002);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add("Hyd");
		al.add("Java Class");
		System.out.println(al);
	}

}
