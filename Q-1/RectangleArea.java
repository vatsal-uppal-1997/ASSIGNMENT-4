import java.util.Scanner;
class Rectangle {
	private int length;
	private int breadth;
	private int area;
	public void setLength(int length) {
		this.length = length;	
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;	
	}
	public int getArea() {
		return (this.length * this.breadth);	
	}
}
public class RectangleArea {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		Rectangle rect1 = new Rectangle();
		rect1.setLength(sc.nextInt());
		rect1.setBreadth(sc.nextInt());
		System.out.println("Area of rectangle : "+rect1.getArea());	
	}
}
