//Zach Panzarino
//4-22-12
//Exercise 4

import java.util.Scanner;
public class Ex4 {
	public static void main (String[] args){
		int sum = 0;
		String keepGoing = "y";
		int nextVal;
		int vals=0;
		Scanner scan = new Scanner(System.in);
		while(keepGoing.equals("y") || keepGoing.equals("Y")){
			System.out.print("Enter the next integer: ");
			nextVal = scan.nextInt();
			sum = sum + nextVal;
			vals+=1;
			System.out.println("Type y or Y to keep going");
			keepGoing = scan.next();
		}
		System.out.println("The sum of your integers is "+sum+"\nYou put in "+vals+" values");
	}
}
/* Program Output
Enter the next integer: 1
Type y or Y to keep going
y
Enter the next integer: 2
Type y or Y to keep going
y
Enter the next integer: 3
Type y or Y to keep going
y
Enter the next integer: 4
Type y or Y to keep going
no
The sum of your integers is 10
You put in 4 values
*/