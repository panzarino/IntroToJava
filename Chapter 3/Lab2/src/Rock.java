//Zach Panzarino
//4-1-15
//Lab 2
//Rock paper scissors game

import java.util.Scanner;
import java.util.Random;
public class Rock {
	public static void main(String[] args){
		String personPlay, computerPlay;
		int computerInt;
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		System.out.print("Make a move (R, P, or S): ");
		personPlay = scan.next();
		personPlay = personPlay.toUpperCase();
		computerInt = generator.nextInt(3)+1;
		switch (computerInt){
		case 1: computerPlay = "R";
		break;
		case 2: computerPlay = "P";
		break;
		case 3: computerPlay = "S";
		break;
		default: computerPlay = "None";
		break;
		}
		if (personPlay.equals("R") || personPlay.equals("P") || personPlay.equals("S")){
			if (computerPlay.equals("R")){
				System.out.println("The computer chose Rock!");
			}
			if (computerPlay.equals("P")){
				System.out.println("The computer chose Paper!");
			}
			if (computerPlay.equals("S")){
				System.out.println("The computer chose Scissors!");
			}
			if (personPlay.equals(computerPlay)){
				System.out.print("It's a tie!");
			}
			else {
				if (personPlay.equals("R")){
					if (computerPlay.equals("P")){
						System.out.print("You lose! Try again next time.\nPaper beats Rock!");
					}
					if (computerPlay.equals("S")){
						System.out.print("You win!\nRock beats Scissors!");
					}
				}
				if (personPlay.equals("P")){
					if (computerPlay.equals("R")){
						System.out.print("You win!\nPaper beats Rock!");
					}
					if (computerPlay.equals("S")){
						System.out.print("You lose! Try again next time.\nScissors beats Paper!");
					}
				}
				if (personPlay.equals("S")){
					if (computerPlay.equals("P")){
						System.out.print("You win!\nScissors beats Paper!");
					}
					if (computerPlay.equals("R")){
						System.out.print("You lose! Try again next time.\nRock beats Scissors!");
					}
				}
			}
		}
		else{
			System.out.print("You made an invalid move!");
		}
	}
}
/* Program Output
Make a move (R, P, or S): r
The computer chose Paper!
You lose! Try again next time.
Paper beats Rock!

Make a move (R, P, or S): p
The computer chose Rock!
You win!
Paper beats Rock!

Make a move (R, P, or S): S
The computer chose Paper!
You win!
Scissors beats Paper!

Make a move (R, P, or S): R
The computer chose Paper!
You lose! Try again next time.
Paper beats Rock!

Make a move (R, P, or S): yesdhfg usdfgsdfg djfhg sdjg sdjg sdjgf jgfjgf
You made an invalid move!

Make a move (R, P, or S): r
The computer chose Paper!
You lose! Try again next time.
Paper beats Rock!
*/