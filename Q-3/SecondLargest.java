import java.util.Scanner;
public class SecondLargest {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		int arr[] = new int[10];
		int i,j,temp;
		for (i=0;i<10;i++) 
			arr[i] = sc.nextInt();
		for (i=1;i<10;i++) {
			j = i;
			while ( j > 0 && arr[j] < arr[j-1] ) {
				temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;			
			}
		}
		System.out.println("Second Largest : "+arr[8]); 	
	}
}
