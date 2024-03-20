package in.pramod;

import java.util.LinkedList;

public class CollectionLinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList<>();
		ll.addLast("Pramod");
		ll.addFirst("G");
		ll.add(null);
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.add(1, "kalyan");
		System.out.println(ll);
		ll.set(2, "srikanth");
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);

	}

}
