//Zach Panzarino
//4-23-15
//Lab 6
//reads a sequence of grades and computes stats

import java.util.Scanner;
public class Grades {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		double grade, sumOfGrades=0;
		int numStudents=0, numPass=0, numFail=0;
		System.out.println("\nGrade Processing Program\n");
		System.out.print("Enter the first student's grade: ");
		grade = scan.nextDouble();
		while (grade>=0){
			sumOfGrades += grade;
			numStudents ++;
			numFail = (grade<60)? numFail+1:numFail;
			numPass = (grade<60)? numPass:numPass+1;
			System.out.print("Enter the next grade (negative to quit): ");
			grade = scan.nextDouble();
		}
		if (numStudents > 0){
			System.out.println("\nGrade Summary: ");
			System.out.println("Class Average: "+sumOfGrades/numStudents);
			System.out.println("Number of Passing Grades: "+numPass);
			System.out.println("Number of Failing Grades: "+numFail);
		}
		else
			System.out.println("No grades processed.");
	}
}
/* Program Output

Grade Processing Program

Enter the first student's grade: 12
Enter the next grade (negative to quit): 100
Enter the next grade (negative to quit): 12
Enter the next grade (negative to quit): 100
Enter the next grade (negative to quit): -1

Grade Summary: 
Class Average: 56.0
Number of Passing Grades: 2
Number of Failing Grades: 2


Grade Processing Program

Enter the first student's grade: -1
No grades processed.
*/