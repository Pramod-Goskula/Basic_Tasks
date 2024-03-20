package in.pramod;

public class Demo {
	public static void main(String args[]) {
		System.out.println("first Line of main method");
		int a = 0;
		int b = 1;
		try {
			if (b == 1) {
				ArithmeticException ae = new ArithmeticException("Division by 0 is not possible");
				throw ae;
			}
			int c = a / b;
			System.out.println("Division" + c);
		} catch (ArithmeticException ae1) {
			System.out.println(ae1.getMessage());
		}
		System.out.println("Last line of code");
	}
}
