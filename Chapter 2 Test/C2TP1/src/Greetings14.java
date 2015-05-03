//Zach Panzarino
//3-27-15
//Chapter 2 Test Problem 1
//Prints a greeting with user's name

import java.util.Scanner;
public class Greetings14 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = scan.nextLine();
		name = name.toUpperCase();
		System.out.print("Pleased to meet you, "+name+".");
	}
}
/* Program Output
Please enter your name: Zach Panzarino
Pleased to meet you, ZACH PANZARINO.
*/