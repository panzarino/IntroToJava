//Zach Panzarino
//Program 2.5
//2-23-15
//Converts mi to km

import java.util.Scanner;
public class LenConverter{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Distance in Miles: ");
		double miles = scan.nextDouble();
		double total = miles * 1.60935;
		System.out.printf("Distance in Kilometers: %5.4f",total);
	}
}

/* Program Output
--------------------Configuration: Program2-5 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter Distance in Miles: 21
Distance in Kilometers: 33.7964
Process completed.
*/