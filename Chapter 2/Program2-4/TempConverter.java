//Zach Panzarino
//Program 2.4
//2-20-15
//Converts Fahrenheit to Celsius

import java.util.Scanner;
public class TempConverter{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		final int base = 32;
		final double conv = 9.0/5.0;
		System.out.print("Enter Temperature in Fahrenheit: ");
		double input = scan.nextDouble();
		double output = (input-base)/conv;
		System.out.printf("The Temperature in Celsius is %5.2f Degrees Celsius",output);
	}
}
/* Program Output
 --------------------Configuration: Program2-4 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter Temperature in Fahrenheit: 212
The Temperature in Celsius is 100.00 Degrees Celsius
Process completed.

--------------------Configuration: Program2-4 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter Temperature in Fahrenheit: 32
The Temperature in Celsius is 0.00 Degrees Celsius
Process completed.
*/