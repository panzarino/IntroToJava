//Zach Panzarino
//4-24-15
//Lab 8
//prints out x powers of 2

import java.util.Scanner;
public class PowersOf2 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("How many powers of 2 would you like to have printed? ");
		int numpow = scan.nextInt();
		System.out.println("Here are the first "+numpow+" powers of 2:");
		int pow = 0;
		int sol = 1;
		while (pow<numpow){
			System.out.println("2^"+pow+" = "+sol);
			sol = 2*sol;
			pow++;
		}
	}
}
/* Program Output
How many powers of 2 would you like to have printed? 4
Here are the first 4 powers of 2:
2^0 = 1
2^1 = 2
2^2 = 4
2^3 = 8

How many powers of 2 would you like to have printed? 12
Here are the first 12 powers of 2:
2^0 = 1
2^1 = 2
2^2 = 4
2^3 = 8
2^4 = 16
2^5 = 32
2^6 = 64
2^7 = 128
2^8 = 256
2^9 = 512
2^10 = 1024
2^11 = 2048
*/