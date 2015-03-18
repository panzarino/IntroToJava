//Zach Panzarino
//Program 2.6
//2-23-15
//Converts hours, minutes, seconds to seconds

import java.util.Scanner;
public class Time{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Hours: ");
		double hours = scan.nextDouble();
		System.out.print("Enter Minutes: ");
		double min = scan.nextDouble();
		System.out.print("Enter Seconds: ");
		double sec = scan.nextDouble();
		double total = hours*60*60+min*60+sec;
		System.out.printf("Time in Seconds: %5.2f",total);
	}
}

/* Program Output
--------------------Configuration: Program2-6 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter Hours: 1
Enter Minutes: 28
Enter Seconds: 42
Time in Seconds: 5322.00
Process completed.
*/