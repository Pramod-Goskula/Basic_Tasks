package in.pramod;

interface Student{

static void studentRegistration(){
System.out.println("Registration Succesfull");
}
}
public class College implements Student {
	public static void main(String args[]){
		Student.studentRegistration();
		}


}
