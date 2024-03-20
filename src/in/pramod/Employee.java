package in.pramod;

import java.io.Serializable;

public class Employee implements Serializable{

	String name;
	String email;
	public Employee(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
}
