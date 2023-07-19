import java.lang.Math;
import java.util.Scanner;
public class MathPower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the power");
		int n=sc.nextInt();
		System.out.println("Enter the exponent to find the power");
		int m=sc.nextInt();
		System.out.println("The Power of "+n+" is "+Math.pow(n, m));
	}

}
