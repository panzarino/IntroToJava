//Zach Panzarino
//4-29-15
//Exercise 17
//rolls dice until it gets snake eyes

import java.util.Random;
public class SnakeEyes {
	public static void main (String[] args){
		Random rand = new Random();
		int count = 0, die1, die2;
		do{
			die1 = rand.nextInt(6)+1;
			die2 = rand.nextInt(6)+1;
			count++;
		}
		while(die1!=1||die2!=1);
		System.out.print("It took "+count+" rolls to get snake eyes.");
	}
}
/* Program Output
It took 2 rolls to get snake eyes.

It took 55 rolls to get snake eyes.

It took 63 rolls to get snake eyes.

It took 3 rolls to get snake eyes.
*/