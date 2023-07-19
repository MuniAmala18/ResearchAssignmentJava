import java.util.Arrays;
import java.util.Scanner;

public class ArraysFill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of an array:");
		String arr[]=new String[sc.nextInt()];
		Arrays.fill(arr, "Orange");

        System.out.println("Array filled with colours " + Arrays.toString(arr));
		

	}

}
