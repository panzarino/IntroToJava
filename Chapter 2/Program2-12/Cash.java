//Zach Panzarino
//Program 2.12
//2-26-15
//Prints total amount from input of certain coins

import java.util.Scanner;
import java.text.NumberFormat;
public class Cash{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		NumberFormat cash = NumberFormat.getCurrencyInstance();
		System.out.print("Enter Amount of Quarters: ");
		double quart = scan.nextDouble();
		System.out.print("Enter Amount of Dimes: ");
		double dimes = scan.nextDouble();
		System.out.print("Enter Amount of Nickels: ");
		double nick = scan.nextDouble();
		System.out.print("Enter Amount of Pennies: ");
		double penn = scan.nextDouble();
		double tot = .25*quart+.10*dimes+.05*nick+.01*penn;
		System.out.print("Total Amount of Money: "+cash.format(tot));
	}
}
/* Program Output
--------------------Configuration: Program2-12 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter Amount of Quarters: 24
Enter Amount of Dimes: 23
Enter Amount of Nickels: 22
Enter Amount of Pennies: 21
Total Amount of Money: $9.61
Process completed.
*/