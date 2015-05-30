//Zach Panzarino
//4-28-15
//Exercise 13
//calculates the area of multiple circles

import java.util.Scanner;
import java.text.DecimalFormat;
public class CircleArea {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.##");
		System.out.print("Enter radius (0 to quit): ");
		double radius = scan.nextDouble(), area;
		while (radius!=0){
			area = Math.PI*radius*radius;
			System.out.println("Area is "+fmt.format(area));
			System.out.print("Enter radius (0 to quit): ");
			radius = scan.nextDouble();
		}
		System.out.print("Program Ended");
	}
}
/* Program Output
Enter radius (0 to quit): 10
Area is 314.16
Enter radius (0 to quit): 2
Area is 12.57
Enter radius (0 to quit): 0
Program Ended
*/