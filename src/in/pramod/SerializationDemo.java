package in.pramod;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String args[]) {
		try {
			Employee e=new Employee("Pramod", "pramod@gmail.com");
			FileOutputStream fout=new FileOutputStream("demo.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(e);
			out.flush();
			out.close();
			System.out.println("Serialization is successfull");
			
			
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
