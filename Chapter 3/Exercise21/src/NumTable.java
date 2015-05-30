//Zach Panzarino
//4-29-15
//Exercise 21
//prints a table of numbers from 1 to 10 with squares and cubes

import java.text.DecimalFormat;
public class NumTable {
	public static void main(String[] args) {
		DecimalFormat fmt = new DecimalFormat("0000");
		System.out.println("NUMBER\tSQUARE\tCUBE");
		System.out.println("------\t------\t----");
		double sqr, cube;
		for(int x=1;x<=10;x++){
			sqr = Math.pow(x,2);
			cube = Math.pow(x,3);
			System.out.println(" "+fmt.format(x)+"\t "+fmt.format(sqr)+"\t"+fmt.format(cube));
		}
	}
}
/* Program Output
NUMBER	SQUARE	CUBE
------	------	----
 0001	 0001	0001
 0002	 0004	0008
 0003	 0009	0027
 0004	 0016	0064
 0005	 0025	0125
 0006	 0036	0216
 0007	 0049	0343
 0008	 0064	0512
 0009	 0081	0729
 0010	 0100	1000
*/