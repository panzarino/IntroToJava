//Zach Panzarino
//Program 2.13
//2-27-15
//Prints random phone number

import java.text.DecimalFormat;
import java.util.Random;
public class Phone{
	public static void main(String[] args){
		DecimalFormat fmt1 = new DecimalFormat("000");
		DecimalFormat fmt2 = new DecimalFormat("0000");
		Random rand = new Random();
		int num1 = rand.nextInt(8);
		int num2 = rand.nextInt(8);
		int num3 = rand.nextInt(8);;
		int part2 = rand.nextInt(743);
		int part3 = rand.nextInt(10000);
		System.out.print("Phone Number: "+num1+num2+num3+"-"+fmt1.format(part2)+"-"+fmt2.format(part3));
	}
}
/* Program Output
--------------------Configuration: Program2-13 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Phone Number: 722-551-8663
Process completed.
--------------------Configuration: Program2-13 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Phone Number: 276-610-9656
Process completed.
--------------------Configuration: Program2-13 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Phone Number: 734-371-6821
Process completed.
*/