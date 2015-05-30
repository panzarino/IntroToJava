//Zach Panzarino
//3-31-15
//Lab 1
//Coputes a raise

import java.util.Scanner;
import java.text.NumberFormat;
public class Salary {
	public static void main(String [] args){
		double currentSalary, raise, newSalary;
		String rating;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the current salary: $");
		currentSalary = scan.nextDouble();
		System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
		rating = scan.next();
		rating = rating.toLowerCase();
		if (rating.equals("excellent")||rating.equals("good")||rating.equals("poor")){
			raise = 0;
			if (rating.equals("excellent")){
				raise = currentSalary*.06;
			}
			if (rating.equals("good")){
				raise = currentSalary*.04;
			}
			if (rating.equals("poor")){
				raise = currentSalary*.015;
			}
			newSalary = currentSalary+raise;
			NumberFormat money = NumberFormat.getCurrencyInstance();
			System.out.println();
			System.out.println("Current Salary:       " + money.format(currentSalary));
			System.out.println("Amount of your raise: " + money.format(raise));
			System.out.println("Your new salary:      " + money.format(newSalary));
			System.out.println();
		}
		else{
			System.out.print("You entered an incorrect rating.");
		}
	}
}
/* Program Output
Enter the current salary: $123456
Enter the performance rating (Excellent, Good, or Poor): Poor

Current Salary:       $123,456.00
Amount of your raise: $1,851.84
Your new salary:      $125,307.84

Enter the current salary: $1231
Enter the performance rating (Excellent, Good, or Poor): Excellent

Current Salary:       $1,231.00
Amount of your raise: $73.86
Your new salary:      $1,304.86

Enter the current salary: $50000000
Enter the performance rating (Excellent, Good, or Poor): Good

Current Salary:       $50,000,000.00
Amount of your raise: $2,000,000.00
Your new salary:      $52,000,000.00

 */