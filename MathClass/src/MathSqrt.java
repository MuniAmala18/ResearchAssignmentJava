import java.lang.Math;
import java.util.Scanner;
public class MathSqrt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the square root");
		int n=sc.nextInt();
		System.out.println("The Square root of "+n+" is "+Math.sqrt(n));
	}

}
