package in.pramod;

public class StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer sb=  new StringBuffer("ashokit");
		sb.insert(4, "Nani");
		System.out.println(sb);
		sb.replace(1, 5, "Pramod");
		System.out.println(sb);
	}

}
