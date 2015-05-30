//Zach Panzarino
//5-4-15
//Exercise 24
//checks if a number is prime

import java.util.Scanner;
public class PrimesBetween {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter starting number: ");
		double num1 = scan.nextInt();
		System.out.print("Enter ending number: ");
		double num2 = scan.nextInt();
		double sqr,x,tot=0;
		boolean prime=false;
		for (double n=num1;n<=num2;n++){
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
				sqr = Math.sqrt(n) + 1;
				x=3;
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
			tot++;
		}
		System.out.print("The number of primes between "+num1+" and "+num2+" is "+tot);
	}
}
/* Program Output
Enter starting number: 50
Enter ending number: 59
The number of primes between 50.0 and 59.0 is 2.0

Enter starting number: 1
Enter ending number: 10
The number of primes between 1.0 and 10.0 is 4.0

Enter starting number: 1
Enter ending number: 1000
The number of primes between 1.0 and 1000.0 is 168.0
*/