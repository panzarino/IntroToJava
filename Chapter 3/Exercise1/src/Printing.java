//Zach Panzarino
//3-26-15
//Exercise 1
//Prints prices based on copies to be printed

import java.util.Scanner;
import java.text.NumberFormat;
public class Printing{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.print("Enter the number of copies to be printed: ");
		double copies = scan.nextDouble();
		double price;
		double total;
		if (copies>=0){
			price = 0;
			total = 0;
		if (copies>0 && copies<=99){
			price = .3;
			total = price*copies;
		}
		if (copies>=100 && copies<=499){
			price = .28;
			total = price*copies;
		}
		if (copies>=500 && copies<=749){
			price = .27;
			total = price*copies;
		}
		if (copies>=750 && copies<=1000){
			price = .26;
			total = price*copies;
		}
		if (copies>1000){
			price = .25;
			total = price*copies;
		}
		System.out.println("Price per copy: "+fmt.format(price));
		System.out.print("Total cost: "+fmt.format(total));
		}
		else{
			System.out.print("That number of copies is impossible to print.");
		}
		
	}
}
/* Program Output
Enter the number of copies to be printed: 1001
Price per copy: $0.25
Total cost: $250.25

Enter the number of copies to be printed: 10
Price per copy: $0.30
Total cost: $3.00

Enter the number of copies to be printed: 120
Price per copy: $0.28
Total cost: $33.60

Enter the number of copies to be printed: 550
Price per copy: $0.27
Total cost: $148.50

Enter the number of copies to be printed: 777
Price per copy: $0.26
Total cost: $202.02
*/