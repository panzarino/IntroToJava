//Zach Panzarino
//3-12-15
//Prints a table of student grades

import java.util.Random;
public class Table {
	public static void main(String[] args){
		Random rand = new Random();
		System.out.println("///////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("==      Student Points      ==");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////");
		String s1name = "Zach";
		int s1lab = rand.nextInt(100);
		int s1bp = rand.nextInt(5);
		int s1tot = s1lab+s1bp;
		String s2name = "Sam";
		int s2lab = rand.nextInt(100);
		int s2bp = rand.nextInt(5);
		int s2tot = s2lab+s2bp;
		String s3name = "Alex";
		int s3lab = rand.nextInt(100);
		int s3bp = rand.nextInt(5);
		int s3tot = s3lab+s3bp;
		String s4name = "Frank";
		int s4lab = rand.nextInt(100);
		int s4bp = rand.nextInt(5);
		int s4tot = s4lab+s4bp;
		String s5name = "Mike";
		int s5lab = rand.nextInt(100);
		int s5bp = rand.nextInt(5);
		int s5tot = s5lab+s5bp;
		System.out.println("Name\tLab\tBonus\tTotal");
		System.out.println("----\t---\t-----\t-----");
		System.out.println(s1name+"\t"+s1lab+"\t"+s1bp+"\t"+s1tot);
		System.out.println(s2name+"\t"+s2lab+"\t"+s2bp+"\t"+s2tot);
		System.out.println(s3name+"\t"+s3lab+"\t"+s3bp+"\t"+s3tot);
		System.out.println(s4name+"\t"+s4lab+"\t"+s4bp+"\t"+s4tot);
		System.out.println(s5name+"\t"+s5lab+"\t"+s5bp+"\t"+s5tot);
	}
}
/* Program Output
///////////////\\\\\\\\\\\\\\\
==      Student Points      ==
\\\\\\\\\\\\\\\///////////////
Name	Lab	Bonus	Total
----	---	-----	-----
Zach	78	4	82
Sam	75	1	76
Alex	16	1	17
Frank	54	1	55
Mike	74	1	75
*/