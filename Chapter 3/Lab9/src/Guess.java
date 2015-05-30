//Zach Panzarino
//4-27-15
//Lab 9
//guessing game with user with numbers from 1 to 10

import java.util.Scanner;
import java.util.Random;
public class Guess {
	public static void main (String[] agrs){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(10)+1;
		System.out.print("Enter your guess (from 1 to 10): ");
		int guess = scan.nextInt();
		while (guess!=num){
			if (guess!=num){
				System.out.println("That guess is wrong.");
				System.out.print("Enter your guess (from 1 to 10): ");
				guess = scan.nextInt();
			}
		}
		System.out.print("You got it right! "+num+" was the answer.");
	}
}
/* Program Output
Enter your guess (from 1 to 10): 2
That guess is wrong.
Enter your guess (from 1 to 10): 1
That guess is wrong.
Enter your guess (from 1 to 10): 3
That guess is wrong.
Enter your guess (from 1 to 10): 4
You got it right! 4 was the answer.

Enter your guess (from 1 to 10): 10
That guess is wrong.
Enter your guess (from 1 to 10): 9
You got it right! 9 was the answer.

Enter your guess (from 1 to 10): 10
You got it right! 10 was the answer.
*/