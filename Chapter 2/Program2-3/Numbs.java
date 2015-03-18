//Zach Panzarino
//Program 2.3
//2-20-15
//Reads 2 floats an prints sum, difference, and product

import java.util.Scanner;
public class Numbs{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		double val1 = scan.nextDouble();
		System.out.print("Enter Second Number: ");
		double val2 = scan.nextDouble();
		double sum = val1+val2;
		double diff = val1-val2;
		double prod = val1*val2;
		System.out.printf("The Sum of These Numbers is %5.2f \n",sum);
		System.out.printf("The Difference of These Numbers is %5.2f \n",diff);
		System.out.printf("The Product of These Numbers is %5.2f \n",prod);
	}
}
/* Program Output
--------------------Configuration: Program2-3 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter First Number: 34
Enter Second Number: 13
The Sum of These Numbers is 47.00 
The Difference of These Numbers is 21.00 
The Product of These Numbers is 442.00 

Process completed.
*/