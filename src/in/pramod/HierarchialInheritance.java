package in.pramod;

class EmployeeSal {
	float salary=40000;
	 void salMsg() {
	  System.out.println(" Parent Class");
	 }
	}
	class Emp1 extends EmployeeSal {
		float bonous=5000;
	 void emp1Child() {
	  System.out.println("Child 1 is Emp1 ");
	 }
	}
	class Emp2 extends EmployeeSal {
		float bonous=10000;
	 void emp2Child() {
	  System.out.println("Child 2 is Emp2");
	 }
//	public void emp1Child() {
//		System.out.println("1st Child");
//		
//	}
	}
	class HierarchialInheritance {
	 public static void main(String args[]) {
		 Emp2 c = new Emp2();
	
	 c.salMsg();
	 System.out.println("Common Salary is "+c.salary);
	 c.emp2Child();
	 System.out.println("Salary is "+ c.salary +" And Bonous is "+ c.bonous);
//	  c.emp1Child();  
	 }
	}