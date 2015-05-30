//Zach Panzarino
//4-15-15
//Exercise 6
//math tutoring program

import java.util.Scanner;
import java.util.Random;
public class MathTutor {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int num1 = rand.nextInt(10)+1;
		int num2 = rand.nextInt(10)+1;
		int opnum = rand.nextInt(4);
		double sol;
		String operator;
		switch (opnum){
		case 0:
			operator = "+";
			sol = (double)num1+num2;
			break;
		case 1:
			operator = "-";
			sol = (double)num1-num2;
			break;
		case 2:
			operator = "*";
			sol = (double)num1*num2;
			break;
		case 3:
			operator = "/";
			sol = (double)num1/num2;
			break;
		default:
			operator = "+";
			sol = (double)num1+num2;
			break;
		}
		System.out.print("What is "+num1+operator+num2+"? ");
		double input = scan.nextDouble();
		if (Math.abs(input-sol)<.001){
			System.out.print("Correct");
		}
		else{
			System.out.print("Incorrect\nThe correct answer to "+num1+operator+num2+" is "+sol);
		}
	}
}

/* Program Output
What is 9-7? 2
Correct

What is 9/3? 3
Correct

What is 3-1? 12
Incorrect

What is 5-6? -1
Correct

What is 4-4? 21
Incorrect

What is 7*1? 7
Correct

What is 3+6? 9
Correct
*/