//Zach Panzarino
//2-24-15
//Lab 7
//prints "I love cs"

import java.util.Scanner;
public class LoveCS {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("How many times do you want to print the message? ");
		int limit = scan.nextInt();
		int count = 1;
		while (count<=limit){
			System.out.println(count+" I love Computer Science!!");
			count++;
		}
		System.out.print("Printed this message "+(count-1)+" times. ");
		int sum=0;
		for (int x=limit;x>0;x--){
			sum+=x;
		}
		System.out.print("The sum of the numbers from 1 to "+limit+" is "+sum);
	}
}
/* Program Output
How many times do you want to print the message? 3
1 I love Computer Science!!
2 I love Computer Science!!
3 I love Computer Science!!
Printed this message 3 times. The sum of the numbers from 1 to 3 is 6

How many times do you want to print the message? 10
1 I love Computer Science!!
2 I love Computer Science!!
3 I love Computer Science!!
4 I love Computer Science!!
5 I love Computer Science!!
6 I love Computer Science!!
7 I love Computer Science!!
8 I love Computer Science!!
9 I love Computer Science!!
10 I love Computer Science!!
Printed this message 10 times. The sum of the numbers from 1 to 10 is 55
*/