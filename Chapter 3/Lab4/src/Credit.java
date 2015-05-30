//Zach Panzarino
//4-10-15
//Lab 4
//prepares a monthly charge account for a customer

import java.util.Scanner;
import java.text.NumberFormat;
public class Credit {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.print("Enter the previous balance: ");
		double pbal = scan.nextDouble();
		System.out.print("Enter the total amount of additional charges: ");
		double charge = scan.nextDouble();
		double total = pbal+charge;
		double interest;
		if (pbal==0){
			interest = 0;
		}
		else{
			interest = .02;
		}
		interest = interest*total;
		total = total+interest;
		double minpay;
		if (total<50){
			minpay = total;
		}
		else {
			if (total>=50 && total<=300){
				minpay = 50;
			}
			else{
				minpay = total*.2;
			}
		}
		System.out.println("\nCS CARD International Statement");
		System.out.println("===============================\n");
		System.out.println("Previous Balance:\t"+fmt.format(pbal));
		System.out.println("Additional Charges:\t"+fmt.format(charge));
		System.out.println("Interest:\t\t"+fmt.format(interest)+"\n");
		System.out.println("New Balance:\t\t"+fmt.format(total)+"\n");
		System.out.println("Minimum Payment:\t"+fmt.format(minpay));
	}
}

/* Program Output
Enter the previous balance: 1234
Enter the total amount of additional charges: 123

CS CARD International Statement
===============================

Previous Balance:	$1,234.00
Additional Charges:	$123.00
Interest:			$27.14

New Balance:		$1,384.14

Minimum Payment:	$276.83

Enter the previous balance: 0
Enter the total amount of additional charges: 12

CS CARD International Statement
===============================

Previous Balance:	$0.00
Additional Charges:	$12.00
Interest:			$0.00

New Balance:		$12.00

Minimum Payment:	$12.00

Enter the previous balance:  50
Enter the total amount of additional charges: 50

CS CARD International Statement
===============================

Previous Balance:	$50.00
Additional Charges:	$50.00
Interest:		$2.00

New Balance:		$102.00

Minimum Payment:	$50.00

Enter the previous balance: 12
Enter the total amount of additional charges: 13

CS CARD International Statement
===============================

Previous Balance:	$12.00
Additional Charges:	$13.00
Interest:		$0.50

New Balance:		$25.50

Minimum Payment:	$25.50
*/