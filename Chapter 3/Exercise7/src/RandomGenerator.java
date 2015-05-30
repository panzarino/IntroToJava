//Zach Panzarino
//5-5-15
//Exercise 7
//randomly generates a sequence of numbers

public class RandomGenerator {
	public static void main (String[] args){
		final int a=1246,c=200,m=50;
		int num = 1, sum;
		for (int x=1;x<=10;x++){
			sum = (a*num+c)%m;
			System.out.println(sum);
			num = sum;
		}
	}
}
/* Program Output
Uses Different Values Each Time

2
42
32
22
12
2
42
32
22
12

46
16
36
6
26
46
16
36
6
26
*/