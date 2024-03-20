package in.pramod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AgeException extends Exception {

	private static final long serialVersionUID = 1L;

	AgeException(String msg) {
		super(msg);
	}
}

public class Vote {
	public static void main(String args[]) throws  IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your age");
		int age = Integer.parseInt(br.readLine());
		try {
			if (age < 18) {
				AgeException ae = new AgeException("Sorry you have to wait for "+(18 -age)+ "Years");
				throw ae;
			}
			System.out.println("Congratulations you are eligible for voting..");
		} catch (AgeException ae) {
			System.out.println(ae);
		}
	}
}
