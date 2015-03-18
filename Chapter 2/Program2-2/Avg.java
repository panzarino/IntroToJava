//Zach Panzarino
//Program 2.2
//2-19-15
//Prints the average of 3 numbers

import java.util.Scanner;
public class Avg{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		double val1 = scan.nextDouble();
		System.out.print("Enter Second Number: ");
		double val2 = scan.nextDouble();
		System.out.print("Enter Third Number: ");
		double val3 = scan.nextDouble();
		double tot = (val1+val2+val3)/3;
		System.out.printf("Average: %5.2f", tot);
	}
}
/* Program Output
--------------------Configuration: Program2-2 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter First Number: 10
Enter Second Number: 20
Enter Third Number: 30.3
Average: 20.10
Process completed.
 */