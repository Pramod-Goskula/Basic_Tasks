package in.pramod;

public class ThrowsKeyWord {
	static void check() throws ArithmeticException {
		System.out.println("Inside check function");
		throw new ArithmeticException("Demo");
		
	}

	public static void main(String args[]) {
		try {
			check();
		} catch (ArithmeticException ae) {
			System.out.println("caught" + ae);
		}
	}
}