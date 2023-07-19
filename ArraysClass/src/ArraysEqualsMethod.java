import java.util.Arrays;
import java.util.Scanner;

public class ArraysEqualsMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of first array:");
		int arr1[]=new int[sc.nextInt()];
		System.out.println("enter the elements into arr1");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the size of second array:");
		int arr2[]=new int[sc.nextInt()];
		System.out.println("enter the elements into arr2");
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[i]=sc.nextInt();
		}
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Arrays are Equal");
		}
		else {
			System.out.println("arrays are not equal");
		}

	}

}
