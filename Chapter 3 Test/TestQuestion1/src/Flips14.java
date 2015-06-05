//Zach Panzarino, 6-4-15
//Chapter 3 Test Question 1, 14

import java.util.Scanner;
import java.text.NumberFormat;
public class Flips14 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getPercentInstance();
		System.out.print("How many flips to analyze? ");
		int flips = scan.nextInt();
		int heads=0,tails=0,tot=flips;
		String input;
		for(int x=1;x<=flips;x++){
			System.out.print("Flip coin and enter result (H or T) #"+x+": ");
			input = scan.next();
			if(input.equalsIgnoreCase("h")){
				heads++;
			}
			else{
				if(input.equalsIgnoreCase("t")){
					tails++;
				}
				else{
					System.out.println("Incorrect Input: Response is Omitted");
					tot--;
				}
			}
		}
		System.out.println(heads+" heads, or "+fmt.format((double)heads/tot));
		System.out.print(tails+" tails, or "+fmt.format((double)tails/tot));
	}
}
/* Program Output
How many flips to analyze? 5
Flip coin and enter result (H or T) #1: H
Flip coin and enter result (H or T) #2: H
Flip coin and enter result (H or T) #3: T
Flip coin and enter result (H or T) #4: H
Flip coin and enter result (H or T) #5: T
3 heads, or 60%
2 tails, or 40%

How many flips to analyze? 4
Flip coin and enter result (H or T) #1: H
Flip coin and enter result (H or T) #2: H
Flip coin and enter result (H or T) #3: H
Flip coin and enter result (H or T) #4: H
4 heads, or 100%
0 tails, or 0%

How many flips to analyze? 7
Flip coin and enter result (H or T) #1: h
Flip coin and enter result (H or T) #2: t
Flip coin and enter result (H or T) #3: h
Flip coin and enter result (H or T) #4: t
Flip coin and enter result (H or T) #5: h
Flip coin and enter result (H or T) #6: h
Flip coin and enter result (H or T) #7: h
5 heads, or 71%
2 tails, or 29%
*/