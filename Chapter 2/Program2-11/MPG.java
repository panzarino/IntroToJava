//Zach Panzarino
//Program 2.11
//2-26-15
//Prints mpg of a trip

import java.util.Scanner;
public class MPG{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Gallons Used: ");
		double gal = scan.nextDouble();
		System.out.print("Enter Odometer at Start of Trip: ");
		double start = scan.nextDouble();
		System.out.print("Enter Odometer After Trip: ");
		double end = scan.nextDouble();
		double miles = end-start;
		double mpg = miles/gal;
		System.out.printf("MPG: %5.2f",mpg);
	}
}
/* Program Output
--------------------Configuration: Program2-11 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter Gallons Used: 234
Enter Odometer at Start of Trip: 234
Enter Odometer After Trip: 234234
MPG: 1000.00
Process completed.
*/
