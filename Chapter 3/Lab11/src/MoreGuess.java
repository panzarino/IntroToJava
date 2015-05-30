//Zach Panzarino
//4-29-15
//Lab 11
//another guessing game... how original

import java.util.Scanner;
import java.util.Random;
public class MoreGuess {
	public static void main (String[] agrs){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(10)+1;
		int guess;
		do{
			System.out.print("Enter your guess (from 1 to 10): ");
			guess = scan.nextInt();
			if (guess!=num)
				System.out.println("That guess is wrong.");
		}
		while (guess!=num);
		System.out.print("You got it right! "+num+" was the answer.");
	}
}