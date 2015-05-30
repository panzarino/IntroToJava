//Zach Panzarino
//3-31-15
//Exercise 3
//Computates price of eggs

import java.util.Scanner;
import java.text.NumberFormat;
public class Eggs {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.print("Enter the number of eggs purchased: ");
		int eggs = scan.nextInt();
		int dozen = eggs/12;
		int extra = eggs-(dozen*12);
		double price;
		if (eggs>=0){
			price = 0;
			if (dozen>=0&&dozen<4){
				price = dozen*.5;
				price += extra*(.5/12);
			}
			if (dozen>=4&&dozen<6){
				price = dozen*.45;
				price += extra*(.45/12);
			}
			if (dozen>=6&&dozen<11){
				price = dozen*.4;
				price += extra*(.4/12);
			}
			if (dozen>=11){
				price = dozen*.35;
				price += extra*(.35/12);
			}
			System.out.print("The bill is equal to: "+fmt.format(price));
		}
		else System.out.print("Error, cannot buy "+eggs+" eggs");
	}
}
/* Program Output
Enter the number of eggs purchased: 18
The bill is equal to: $0.75

Enter the number of eggs purchased: 50
The bill is equal to: $1.88

Enter the number of eggs purchased: 100
The bill is equal to: $3.33

Enter the number of eggs purchased: 123123
The bill is equal to: $3,591.09

Enter the number of eggs purchased: -12
Error, cannot buy -12 eggs
*/