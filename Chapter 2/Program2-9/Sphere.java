//Zach Panzarino
//Program2.9
//2-25-15
//Uses radius to calculate volume and surface area of a sphere

import java.util.Scanner;
public class Sphere{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Radius of the Sphere: ");
		double radius = scan.nextDouble();
		double volume = (4.0/3)*Math.PI*Math.pow(radius,3);
		double sa = 4.0*Math.PI*Math.pow(radius, 2);
		System.out.printf("Sphere Volume: %5.4f \n",volume);
		System.out.printf("Sphere Surface Area: %5.4f",sa);
	}
}
/* Program Output
--------------------Configuration: Program2-9 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter Radius of the Sphere: 39
Sphere Volume: 248474.8462 
Sphere Surface Area: 19113.4497
Process completed.
*/