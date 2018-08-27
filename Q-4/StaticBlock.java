class SomeClass {
	static {
		System.out.println("I will get executed only if mem is allocated to this class");
	}
}
public class StaticBlock {
	static {
		System.out.println("I will get executed right away !");
	}
	public static void main(String args[]) {
		SomeClass reference; // Not Yet
		reference = new SomeClass(); // Now the static block will be executed !	
	}
}
