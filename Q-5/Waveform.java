import java.util.Scanner;
public class Waveform {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		int arr[] = new int[10];
		int temp = 0;
		for (int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
			if (i%2 != 0) {
				temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}
		}
		for (int i: arr)
			System.out.print(i+" ");
	}
}
