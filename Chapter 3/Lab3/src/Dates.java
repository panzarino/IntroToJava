//Zach Panzarino
//4-2-15
//Lab 3
//determines whether a user entered 2nd millenium date is valid

import java.util.Scanner;
public class Dates {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int month,day,year,daysInMonth;
		boolean monthValid,yearValid,dayValid,leapYear;
		System.out.print("Enter a month number: ");
		month = scan.nextInt();
		System.out.print("Enter a day: ");
		day = scan.nextInt();
		System.out.print("Enter a year: ");
		year = scan.nextInt();
		if (year>=1000 && year<=1999){
			yearValid=true;
		}
		else{
			yearValid=false;
		}
		if (year%4==0){
			if (year%100==0){
				if(year%400==0){
					leapYear = true;
				}
				else{
					leapYear = false;
				}
			}
			else{
				leapYear = true;
			}
		}
		else{
			leapYear=false;
		}
		if (month<=12 && month>0){
			monthValid=true;
			if (month==2){
				if (leapYear==true){
					daysInMonth=29;
				}
				else {
					daysInMonth=28;
				}
			}
			else{
				if (month==4 || month==6 || month==9 || month==11){
					daysInMonth=30;
				}
				else{
					daysInMonth=31;
				}
			}
		}
		else{
			monthValid=false;
			daysInMonth=0;
		}
		if (monthValid == true){
			if (day>0 && day<=daysInMonth){
				dayValid = true;
			}
			else{
				dayValid = false;
			}
		}
		else{
			dayValid = false;
		}
		if (monthValid == true && dayValid == true && yearValid == true){
			System.out.println("Date is valid: "+month+"/"+day+"/"+year+" is a valid date.");
		}
		else{
			System.out.println("Date is not valid: "+month+"/"+day+"/"+year+" is not a valid date.");
		}
		if (leapYear == true){
			System.out.print(year+" is a leap year");
		}
	}
}

/* Program Output
Enter a month number: 4
Enter a day: 12
Enter a year: 1999
Date is valid: 4/12/1999 is a valid date.

Enter a month number: 13
Enter a day: 12
Enter a year: 12
Date is not valid: 13/12/12 is not a valid date.

Enter a month number: 13
Enter a day: 12
Enter a year: 1234
Date is not valid: 13/12/1234 is not a valid date.

Enter a month number: 2
Enter a day: 29
Enter a year: 1940
Date is valid: 2/29/1940 is a valid date.

Enter a month number: 2
Enter a day: 29
Enter a year: 1941
Date is not valid: 2/29/1941 is not a valid date.

Enter a month number: 3
Enter a day: 32
Enter a year: 1223
Date is not valid: 3/32/1223 is not a valid date.

Enter a month number: 4
Enter a day: 12
Enter a year: 2015
Date is not valid: 4/12/2015 is not a valid date.
*/