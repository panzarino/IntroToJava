//Zach Panzarino
//4-29-15
//Exercise 15
//finds average of a quiz of a class of 10 people

import java.util.Scanner;
public class ClassGrades {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		double total = 0, count = 1, grade;
		while(count<=10){
			System.out.print("Enter a Grade: ");
			grade = scan.nextDouble();
			total+=grade;
			count++;
		}
		double avg = total/10;
		System.out.print("The Class Average is "+avg);
	}
}
/* Program Average
Enter a Grade: 99
Enter a Grade: 98
Enter a Grade: 97
Enter a Grade: 96
Enter a Grade: 95
Enter a Grade: 94
Enter a Grade: 93
Enter a Grade: 92
Enter a Grade: 91
Enter a Grade: 90
The Class Average is 94.5
*/