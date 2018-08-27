import java.util.Scanner;
class Complex {
	private int real;
	private int imaginary;
	public void setReal(int real) {
		this.real = real;	
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;	
	}
	public String getComplex() {
		return (this.real+"+"+this.imaginary+"i");	
	}
}
public class ComplexDisplay {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		Complex c1 = new Complex();
		System.out.println("Enter real part :-");
		c1.setReal(sc.nextInt());
		System.out.println("Enter imaginary part :-");
		c1.setImaginary(sc.nextInt());
		System.out.println(c1.getComplex());	
	}
}
