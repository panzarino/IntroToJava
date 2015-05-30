//Zach Panzarino
//5-4-15
//Exercise 24
//checks if a number is prime

import java.util.Scanner;
public class Prime {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		double n = scan.nextInt();
		boolean prime=false;
		if (n==2){
			prime=true;
		}
		else
			if(n==3)
				prime=true;
		else{
			if (n%2==0 || n<=1){
				prime=false;
			}
			else{
				double sqr = Math.sqrt(n) + 1;
				double x=3;
				while (x<=sqr){
					if (n%x==0){
						prime=false;
						x=sqr+1;
					}
					else
						prime=true;
					x+=2;
				}
			}
		}
		if (prime==true)
			System.out.print("Prime");
		else
			System.out.print("Not Prime");
	}
}
/* Program Output
Enter an integer: 11
Prime

Enter an integer: 1
Not Prime

Enter an integer: 2
Prime

Enter an integer: 3
Prime

Enter an integer: 12
Not Prime

Enter an integer: 5
Prime

Enter an integer: 1234567890
Not Prime

Enter an integer: 123
Not Prime

Enter an integer: 59
Prime

Enter an integer: 59
Prime

Enter an integer: 1235
Not Prime

Enter an integer: 1237
Prime
*/