package in.pramod;

public class Main {

	public static void main(String argds[]) {
		DataBindingPerson b=new DataBindingPerson();
		b.setName("Pramod");
		b.setPhoneNo("9090898978");
		b.setGender("Male");
		b.getName();
		b.getGender();
		b.getPhoneNo();
		System.out.println(b.getGender());
		System.out.println(b.getName() +""+ b.getPhoneNo());
		
	}
}
