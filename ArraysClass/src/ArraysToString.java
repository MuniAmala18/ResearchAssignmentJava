import java.util.Arrays;
import java.util.Scanner;

public class ArraysToString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter the elements into arr");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		String str= Arrays.toString(arr);
		System.out.println("Arrays to string "+ str);

	}

}
