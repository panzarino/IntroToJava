//Zach Panzarino
//4-30-15
//Exercise 23
//evaluates an expression entered by the user

import java.util.Scanner;
public class Evaluate {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		double num1, num2, sol=0, count=1;
		String op;
		System.out.print("Enter the first number (0 to quit): ");
		num1 = scan.nextInt();
		while(num1!=0){
			count++;
			System.out.print("Enter the operator (+,-,*,/): ");
			op = scan.next();
			while(!op.equals("+")&&!op.equals("-")&&!op.equals("*")&&!op.equals("/")){
				System.out.print("Incorrect operator! Try again: ");
				op = scan.next();
			}
			System.out.print("Enter the second number: ");
			num2 = scan.nextInt();
			if(op.equals("+"))
				sol = num1+num2;
			else if(op.equals("-"))
				sol = num1-num2;
			else if(op.equals("*"))
				sol = num1*num2;
			else if(op.equals("/"))
				sol = num1/num2;
			System.out.println(num1+" "+op+" "+num2+" = "+sol);
			if (count!=1){
				System.out.print("Enter the first number (0 to quit): ");
				num1 = scan.nextInt();
			}
		}
	}
}
/* Program Output
Enter the first number (0 to quit): 12
Enter the operator (+,-,*,/): +
Enter the second number: 12
12.0 + 12.0 = 24.0
Enter the first number (0 to quit): 0

Enter the first number (0 to quit): 7
Enter the operator (+,-,*,/): /
Enter the second number: 4
7.0 / 4.0 = 1.75
Enter the first number (0 to quit): 69
Enter the operator (+,-,*,/): /
Enter the second number: 3
69.0 / 3.0 = 23.0
Enter the first number (0 to quit): 0
*/