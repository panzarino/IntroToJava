//Zach Panzarino
//3-27-15
//Chapter 2 Test Problem 2
//Demonstrates basic computation by getting people and price per person to calculate total cost

import java.util.Scanner;
import java.text.NumberFormat;
public class Movies14 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		System.out.print("Number of People: ");
		int people = scan.nextInt();
		System.out.print("Price per Person: $");
		double price = scan.nextDouble();
		double total = people*price;
		System.out.print("Total Sales: "+moneyFormat.format(total));
	}
}
/* Program Output
Number of People: 15
Price per Person: $7.55
Total Sales: $113.25
*/