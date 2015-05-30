//Zach Panzarino
//4-28-15
//Lab 10
//prints the factorial of a number

import java.util.Scanner;
public class Factorials {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int input = -1;
		while (input<0){
			System.out.print("Enter a non negative integer: ");
			input = scan.nextInt();
		}
		long sum = 1;
		System.out.print(input+" factorial equals ");
		while (input>0){
			sum*=input;
			input--;
		}
		System.out.print(sum);
	}
}
/* Program Output
Enter a non negative integer: -2
Enter a non negative integer: -2
Enter a non negative integer: 12
12 factorial equals 479001600

Enter a non negative integer: 2
2 factorial equals 2

Enter a non negative integer: -2
Enter a non negative integer: 4
4 factorial equals 24

Enter a non negative integer: 0
0 factorial equals 1
*/