//Zach Panzarino
//Program 2.7
//2-23-15
//Converts seconds to hours, minutes, and seconds

import java.util.Scanner;
public class SecConv{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Time in Seconds: ");
		int time = scan.nextInt();
		int hours = time/3600;
		int total = hours;
		int hoursec = hours*3600;
		time = time-hoursec;
		int minutes = time/60;
		total = total+minutes;
		int minsec = minutes*60;
		time = time-minsec;
		int sec = time;
		total = total+time;
		System.out.println("Hours: "+hours);
		System.out.println("Minutes: "+minutes);
		System.out.println("Seconds: "+sec);
	}
}

/*Program Output
--------------------Configuration: Program2-7 - JDK version 1.7.0_04 <Default> - <Default>--------------------
Enter Time in Seconds: 9999
Hours: 2
Minutes: 46
Seconds: 39

Process completed.
*/