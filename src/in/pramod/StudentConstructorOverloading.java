package in.pramod;

public class StudentConstructorOverloading {

	int age;
	String name;
	 
	public StudentConstructorOverloading(int a) {
		age=a;
	}
	public StudentConstructorOverloading(int a,String n) {
		age=a;
		name=n;
	}
	
	public static void main(String[] args) {
		StudentConstructorOverloading s=new StudentConstructorOverloading(22);
		System.out.println("Age:" +s.age);
		StudentConstructorOverloading s1=new StudentConstructorOverloading(23, "Pramod");
	
		System.out.println("Age :"+s1.age);
		System.out.println("Name: "+s1.name);
	}
	
}
