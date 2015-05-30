//Zach Panzarino
//4-29-15
//Exercise 15
//finds average of a quiz of a class of 10 people

import java.util.Scanner;
public class ClassGrades {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		double total = 0, count = 1, grade = 0;
		do{
			System.out.print("Enter a Grade (Negative to Quit): ");
			grade = scan.nextDouble();
			if (grade>=0){
				total+=grade;
				count++;
			}
		}
		while(grade>=0);
		double avg = total/(count-1);
		System.out.print("The Class Average is "+avg);
	}
}
/* Program Output
Enter a Grade (Negative to Quit): 12
Enter a Grade (Negative to Quit): -1
The Class Average is 12.0

Enter a Grade (Negative to Quit): 20
Enter a Grade (Negative to Quit): 10
Enter a Grade (Negative to Quit): -1
The Class Average is 15.0
*/