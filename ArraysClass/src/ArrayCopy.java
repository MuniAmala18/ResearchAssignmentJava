import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter the elements into arr");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		int []copyArray=Arrays.copyOf(arr, arr.length);
		System.out.println("Source array: " + Arrays.toString(arr));
        System.out.println("Copied array: " + Arrays.toString(copyArray));

	}

}
