package in.pramod;

public class MainThreadDemo {

	public static void main(String args[]){

		Thread th = Thread.currentThread();
		System.out.println(th);
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println(th.getThreadGroup());
		}
}
