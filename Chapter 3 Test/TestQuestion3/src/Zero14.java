//Zach Panzarino, 6-4-15
//Chapter 3 Test Question 3, 14

import java.util.Random;
public class Zero14 {
	public static void main (String[] args){
		Random rand = new Random();
		int count=0,num=1;
		while(num!=0){
			num = rand.nextInt(10);
			System.out.print(num+" ");
			count++;
		}
		System.out.print("\nLength was "+count);
	}
}
/* Program Output
1 7 0 
Length was 3

0 
Length was 1

2 0 
Length was 2

1 8 5 5 5 1 9 1 2 3 0 
Length was 11

5 9 9 6 3 6 3 3 6 6 6 7 8 5 8 4 6 2 6 6 9 9 3 2 5 3 4 8 0 
Length was 29
*/