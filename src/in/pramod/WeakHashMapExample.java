package in.pramod;

import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap<Person, String> wh=new WeakHashMap<>();
		Person p=new Person();
		wh.put(p, "Pramod");
		System.out.println(wh);
		p=null;
		System.gc();
		Thread.sleep(500);
		System.out.println(wh);
		
		
	}

}

class Person{
	public String toString() {
		return "Temp";
	}
	public void finalize() {
		System.out.println("finalize() Method is called");
	}
}

