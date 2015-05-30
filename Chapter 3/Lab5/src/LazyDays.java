//Zach Panzarino
//4-13-15
//Lab 5
//suggests appropriate activities based on weather

import java.util.Scanner;
public class LazyDays {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the current temperature: ");
		double temp = scan.nextDouble();
		String activity = "None";
		if (temp>=80)
			activity="Swimming";
		else if(60<=temp && temp<80)
			activity="Tennis";
		else if(40<=temp && temp<60)
			activity="Golf";
		else if(temp<40)
			activity="Skiing";
		System.out.println("Your activity for today is "+activity);
		if (temp<20 || temp>90)
			System.out.print("Visit our shops!");
	}
}

/* Program Output
Enter the current temperature: 100
Your activity for today is Swimming
Visit our shops!

Enter the current temperature: 85
Your activity for today is Swimming

Enter the current temperature: 70
Your activity for today is Tennis

Enter the current temperature: 50
Your activity for today is Golf

Enter the current temperature: 30
Your activity for today is Skiing

Enter the current temperature: -10
Your activity for today is Skiing
Visit our shops!
*/