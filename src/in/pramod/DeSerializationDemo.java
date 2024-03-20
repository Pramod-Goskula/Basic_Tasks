package in.pramod;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String args[]) {
		try {
			FileInputStream fin=new FileInputStream("demo.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			Employee emp=(Employee) in.readObject();
			in.close();
			System.out.println("DeSerialization is Successfull");
			System.out.println("Name :" +emp.name);
			System.out.println("Email :"+emp.email);	
		}catch (Exception e) {
		System.out.println(e);
		}
	}
}
