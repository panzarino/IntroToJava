//Zach Panzarino
//4-14-15
//Exercise 5
//prompts user for grade and displays letter grade

import java.util.Scanner;
public class Grade {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the percentage grade: ");
		double num = scan.nextDouble();
		String grade;
		if (num<=100&&num>=90)
			grade = "A";
		else if (num<90&&num>=80)
			grade = "B";
		else if (num<80&&num>=70)
			grade = "C";
		else if (num<70&&num>=60)
			grade = "D";
		else if (num<60&&num>=0)
			grade = "F";
		else
			grade = "Incorrect Grade";
		System.out.print("The letter grade is: "+grade);
	}
}
/* Program Output
Enter the percentage grade: 96
The letter grade is: A

Enter the percentage grade: 88
The letter grade is: B

Enter the percentage grade: 76
The letter grade is: C

Enter the percentage grade: 69
The letter grade is: D

Enter the percentage grade: 12
The letter grade is: F

Enter the percentage grade: -1
The letter grade is: Incorrect Grade
*/