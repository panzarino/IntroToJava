//Zach Panzarino
//Program 2.10
//2-26-15
//Takes sides of triangle and calculates area of the triangle

import java.util.Scanner;
public class TriArea{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Side Length: ");
		double s1 = scan.nextDouble();
		System.out.print("Enter Second Side Length: ");
		double s2 = scan.nextDouble();
		System.out.print("Enter Third Side Length: ");
		double s3 = scan.nextDouble();
		double s = .5*(s1+s2+s3);
		double a = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.printf("Area of the Triangle: %5.2f",a);
	}
}
/* Program Output
--------------------Configuration: Program2-10 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter First Side Length: 3
Enter Second Side Length: 4
Enter Third Side Length: 5
Area of the Triangle:  6.00
Process completed.
*/