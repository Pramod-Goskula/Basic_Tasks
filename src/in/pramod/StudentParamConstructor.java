package in.pramod;

public class StudentParamConstructor {


		//instance variables
		int age;
		String name;
		// parameterized Constructor
		public StudentParamConstructor(int a,String n){
		age=a; //initialization 
		name=n;
		System.out.println("parameterized Called");
		  }

		public static void main(String[] args){
			StudentParamConstructor s=new StudentParamConstructor(22,"Pramod");
			System.out.println("Age: " +s.age);
			System.out.println("Name: "+ s.name);

		 }
		}
