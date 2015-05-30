//Zach Panzarino
//4-20-15
//Exercise 8
//Guessing game between computer and one player

import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(19)+1;
		System.out.print("Guess a number between 1 and 20: ");
		int guess = scan.nextInt();
		if (num==guess)
			System.out.println("You won!");
		else
			System.out.println("Better luck next time");
		System.out.print("The number was: "+num+"\nYou guessed: "+guess);
	}
}
/* Program Output
Guess a number between 1 and 20: 12
You won!
The number was: 12
You guessed: 12

Guess a number between 1 and 20: 12
Better luck next time
The number was: 8
You guessed: 12

Guess a number between 1 and 20: 14
Better luck next time
The number was: 17
You guessed: 14
*/