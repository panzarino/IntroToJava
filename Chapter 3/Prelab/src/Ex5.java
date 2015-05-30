//Zach Panzarino
//4-22-12
//Exercise 5

public class Ex5 {
	public static void main (String[] args){
		int count;
		
		//Original code - makes an infinite loop
		/* count = 10;
		while (count>=0){
			System.out.println(count);
			count = count + 1;
		} */
		
		//Fixed code
		count = 10;
		while (count >= 1){
			System.out.println(count);
			count-=1;
		}
	}
}
/* Program Output
10
9
8
7
6
5
4
3
2
1
*/