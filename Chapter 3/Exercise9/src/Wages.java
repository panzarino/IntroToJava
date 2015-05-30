//Zach Panzarino
//2-27-15
//Exercise 9
//determines gross wages of an employee

import java.util.Scanner;
import java.text.NumberFormat;
public class Wages {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.print("Enter hours worked: ");
		double hours = scan.nextDouble();
		System.out.print("Enter hourly rate: ");
		double rate = scan.nextDouble();
		double tot = 0;
		if (hours>40){
			double extra = hours-40;
			hours = 40;
			tot = hours*rate+(extra*(rate*1.5));
		}
		else{
			tot = hours*rate;
		}
		System.out.print("\nGross wages = "+fmt.format(tot));
	}
}
/* Program Output
Enter hours worked: 45
Enter hourly rate: 10

Gross wages = $475.00

Enter hours worked: 55
Enter hourly rate: 100

Gross wages = $6,250.00

Enter hours worked: 50
Enter hourly rate: 100

Gross wages = $5,500.00

Enter hours worked: 12
Enter hourly rate: 21.34

Gross wages = $256.08
*/