package basicAlgorithm01;

import java.util.Scanner;

public class Q02_min3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("최솟값은 : " + min3(a,b,c));
	}
	
	static int min3(int a, int b, int c) {
		
		int min = a;
		
		if (b>c) {
			if (min>c)
				min = c;
		} else { // b가 c보다 작은 경우
			if (min>b)
				min = b;
		}
		return min;
	}
}
