//Zach Panzarino
//4-14-15
//Exercise 4
//determines if a car model number is defective

import java.util.Scanner;
public class CarRecall {
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the car's model number: ");
		int m = scan.nextInt();
		if (m==119||m==179||(189<=m&&m<=195)||m==221||m==780)
			System.out.print("Your car is defective. It must be repaired.");
		else
			System.out.print("Your car is not defective.");
	}
}
/* Program Output
Enter the car's model number: 123
Your car is not defective.

Enter the car's model number: 119
Your car is defective. It must be repaired.

Enter the car's model number: 179
Your car is defective. It must be repaired.

Enter the car's model number: 192
Your car is defective. It must be repaired.

Enter the car's model number: 221
Your car is defective. It must be repaired.

Enter the car's model number: 780
Your car is defective. It must be repaired.

Enter the car's model number: 69
Your car is not defective.
*/