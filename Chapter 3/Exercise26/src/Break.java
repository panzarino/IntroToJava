//Zach Panzarino
//5-5-15
//Exercise 26
//breaks up a sentence into words

import java.util.Scanner;
public class Break {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a line of text: ");
		String input = scan.nextLine();
		for (int x=0;x<input.length();x++){
			char c = input.charAt(x);
			if (Character.isLetter(c)){
				System.out.print(c);
			}
			else
				System.out.println();
		}
	}
}
/* Program Output
Enter a line of text: whats up boy
whats
up
boy

Enter a line of text: this is just a little test
this
is
just
a
little
test
*/