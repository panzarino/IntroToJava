//Zach Panzarino
//3-27-15
//Chapter 2 Test Problem 3
//Demonstrates modulus in basic computation with eggs

import java.util.Scanner;
public class Eggs14 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("How many eggs? ");
		int eggs = scan.nextInt();
		int gross = eggs/144;
		int dozen = (eggs%144)/12;
		int extra = (eggs%144)%12;
		System.out.print("There are "+gross+" gross "+dozen+" dozen eggs and "+extra+" left over.");
	}
}
/* Program Output
How many eggs? 232
There are 1 gross 7 dozen eggs and 4 left over.
*/