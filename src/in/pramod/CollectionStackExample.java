package in.pramod;

import java.util.Stack;

public class CollectionStackExample {
	public static void main(String args[]) {
		Stack<Double>  s=new Stack<>();
		s.push(24.9);
		s.push(20.00);
		s.push(15.87);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());
	}

}
