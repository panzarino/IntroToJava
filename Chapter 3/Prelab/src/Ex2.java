//Zach Panzarino
//4-21-12
//Exercise 2

public class Ex2 {
	public static void main (String[] args){
		final int LIMIT = 16;
		int count = 1;
		int sum = 0;
		int nextVal = 2;
		while (sum<LIMIT){
			sum = sum + nextVal;
			nextVal = nextVal+2;
			count = count+1;
			System.out.println(sum);
			System.out.println(nextVal);
			System.out.println(count);
			System.out.println();
		}
		System.out.println("Had to add together "+(count-1)+" even numbers to reach value "+LIMIT+". Sum is "+sum);
	}
}