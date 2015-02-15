//Zach Panzarino
//Mods 11-12
//Prints a greeting to the screen
import java.util.Scanner;
public class Greeting
{
	public static void main (String[] args)
	{
		//Asks for user input and then prints the name of the user
		String message;
		System.out.println("What is your name?");
		Scanner scn = new Scanner(System.in);
		message = scn.nextLine();
		System.out.print("Hello, ");
		System.out.print(message);
		System.out.print(". Welcome to Intro to Java Class.");
	}
}
/* Program Output
--------------------Configuration: Second Program - JDK version 1.7.0_04 <Default> - <Default>--------------------
What is your name?
Zach
Hello, Zach. Welcome to Intro to Java Class.
Process completed.
*/