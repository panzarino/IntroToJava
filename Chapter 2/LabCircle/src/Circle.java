//Zach Panzarino
//3-16-15
//Print the area of a circle with two different radii

import java.util.Scanner;
public class Circle {
	public static void main(String[] args){
		final double PI = 3.14159;
		int radius = 10;
		double area = PI*radius*radius;
		System.out.println("The area of a circle with radius "+radius+" is "+area);
		radius = 20;
		area = PI*radius*radius;
		System.out.println("The area of a circle with radius "+radius+" is "+area);
		
		System.out.println("");
		
		radius = 10;
		area = PI*radius*radius;
		double circ = 2*PI*radius;
		System.out.println("The area of a circle with radius "+radius+" is "+area);
		System.out.println("The circumference of a circle with radius "+radius+" is "+circ);
		radius = 20;
		area = PI*radius*radius;
		circ = 2*PI*radius;
		System.out.println("The area of a circle with radius "+radius+" is "+area);
		System.out.println("The circumference of a circle with radius "+radius+" is "+circ);
		
		System.out.println("");
		
		radius = 10;
		double area1 = PI*radius*radius;
		double circ1 = 2*PI*radius;
		System.out.println("The area of a circle with radius "+radius+" is "+area1);
		System.out.println("The circumference of a circle with radius "+radius+" is "+circ1);
		radius = 20;
		double area2 = PI*radius*radius;
		double circ2 = 2*PI*radius;
		System.out.println("The area of a circle with radius "+radius+" is "+area2);
		System.out.println("The circumference of a circle with radius "+radius+" is "+circ2);
		double areachange = area2/area1;
		System.out.println("The change in area is "+areachange);
		System.out.println("The change in area is always 4 times.");
		double circchange = circ2/circ1;
		System.out.println("The change in circumference is "+circchange);
		System.out.println("The change in area is always 2 times.");
		
		System.out.println("");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		radius = scan.nextInt();
		area1 = PI*radius*radius;
		circ1 = 2*PI*radius;
		System.out.println("The area of a circle with radius "+radius+" is "+area1);
		System.out.println("The circumference of a circle with radius "+radius+" is "+circ1);
		radius = 2*radius;
		area2 = PI*radius*radius;
		circ2 = 2*PI*radius;
		System.out.println("The area of a circle with radius "+radius+" is "+area2);
		System.out.println("The circumference of a circle with radius "+radius+" is "+circ2);
		areachange = area2/area1;
		System.out.println("The change in area is "+areachange);
		System.out.println("The change in area is always 4 times, and it does not matter what the radius is.");
		circchange = circ2/circ1;
		System.out.println("The change in circumference is "+circchange);
		System.out.println("The change in area is always 2 times, and it does not matter what the radius is.");
	}
}
/* Program Output
The area of a circle with radius 10 is 314.159
The area of a circle with radius 20 is 1256.636

The area of a circle with radius 10 is 314.159
The circumference of a circle with radius 10 is 62.8318
The area of a circle with radius 20 is 1256.636
The circumference of a circle with radius 20 is 125.6636

The area of a circle with radius 10 is 314.159
The circumference of a circle with radius 10 is 62.8318
The area of a circle with radius 20 is 1256.636
The circumference of a circle with radius 20 is 125.6636
The change in area is 4.0
The change in area is always 4 times.
The change in circumference is 2.0
The change in area is always 2 times.

Enter a radius: 21
The area of a circle with radius 21 is 1385.44119
The circumference of a circle with radius 21 is 131.94678
The area of a circle with radius 42 is 5541.76476
The circumference of a circle with radius 42 is 263.89356
The change in area is 4.0
The change in area is always 4 times, and it does not matter what the radius is.
The change in circumference is 2.0
The change in area is always 2 times, and it does not matter what the radius is.
*/