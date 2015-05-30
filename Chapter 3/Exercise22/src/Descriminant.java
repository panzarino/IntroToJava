//Zach Panzarino
//4-30-15
//Exercise 22
//prints the amount of roots that a quadratic equation has

import java.util.Scanner;
public class Descriminant {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		double a = scan.nextInt();
		System.out.print("Enter the value for b: ");
		double b = scan.nextInt();
		System.out.print("Enter the value for c: ");
		double c = scan.nextInt();
		double desc = Math.pow(b, 2)-(4*a*c);
		System.out.print("a = "+a+", b = "+b+", c = "+c+": ");
		if(desc==0)
			System.out.print("One Root");
		else if(desc<0)
			System.out.print("No Real Roots");
		else 
			System.out.print("Two Roots");
	}
}
/* Program Output
Enter the value for a: 1
Enter the value for b: 2
Enter the value for c: 1
a = 1.0, b = 2.0, c = 1.0: One Root

Enter the value for a: 2
Enter the value for b: 2
Enter the value for c: 2
a = 2.0, b = 2.0, c = 2.0: No Real Roots

Enter the value for a: 1
Enter the value for b: 100
Enter the value for c: 1
a = 1.0, b = 100.0, c = 1.0: Two Roots
*/