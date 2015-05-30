//Zach Panzarino
//3-30-15
//Exercise 2
//Checks if a package can be shipped

import java.util.Scanner;
public class PackageCheck {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter package weight in kilograms: ");
		double weight = scan.nextDouble();
		System.out.print("Enter package length in centimeters: ");
		double l = scan.nextDouble();
		System.out.print("Enter package width in centimeters: ");
		double w = scan.nextDouble();
		System.out.print("Enter package height in centimeters: ");
		double h = scan.nextDouble();
		boolean heavy=false, large=false;
		if (weight>27){
			System.out.print("Package is too heavy");
			heavy=true;
		}
		double volume = l*w*h;
		if (volume>100000){
			System.out.print("Package is too large");
			large=true;
		}
		if (!heavy && !large) System.out.print("Package is good to be shipped");
	}
}
/* Program Output
Enter package weight in kilograms: 32
Enter package length in centimeters: 10
Enter package width in centimeters: 25
Enter package height in centimeters: 38
Package is too heavy

Enter package weight in kilograms: 10
Enter package length in centimeters: 100
Enter package width in centimeters: 12
Enter package height in centimeters: 18
Package is good to be shipped

Enter package weight in kilograms: 2
Enter package length in centimeters: 123
Enter package width in centimeters: 1234
Enter package height in centimeters: 1231
Package is too large
*/