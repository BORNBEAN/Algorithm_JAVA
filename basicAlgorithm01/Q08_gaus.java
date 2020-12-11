package basicAlgorithm01;

import java.util.Scanner;

public class Q08_gaus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int n = sc.nextInt();
		
		sum = (1+n)*(n/2) + (n/2+1);
		System.out.println("sum : "+sum);
	}

}
