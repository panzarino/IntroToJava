//Zach Panzarino
//Program 2.8
//2-24-15
//Finds distance from coordinate points

import java.util.Scanner;
public class Distance{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter X-Coordinate of First Point: ");
		double x1 = scan.nextDouble();
		System.out.print("Enter Y-Coordinate of First Point: ");
		double y1 = scan.nextDouble();
		System.out.print("Enter X-Coordinate of Second Point: ");
		double x2 = scan.nextDouble();
		System.out.print("Enter Y-Coordinate of Second Point: ");
		double y2 = scan.nextDouble();
		double tot = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		System.out.printf("The Distance is %5.2f",tot);
	}
}
/* Program Output
--------------------Configuration: Program2-8 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter X-Coordinate of First Point: 1
Enter Y-Coordinate of First Point: 0
Enter X-Coordinate of Second Point: 0
Enter Y-Coordinate of Second Point: 0
The Distance is  1.00
Process completed.
*/