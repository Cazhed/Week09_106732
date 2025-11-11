package week09.zachary.id.ac.umn;

interface a {
	void displayA();
}

interface b{
	void displayB();
}

public class C implements a, b{
	public void displayA() {
		System.out.println("Display A");
	}
	
	public void displayB() {
		System.out.println("Display B");
	}
	
	public static void main(String[] args) {
		
		C c = new c();
		c.displayA();
		c.displayB();
	}
}
