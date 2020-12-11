package basicAlgorithm01;

import java.util.Scanner;

public class Q09_sumof {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (n>=n2) {
			max = n;
			min = n2;
		} else {
			max = n2;
			min = n;
		}
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}
			
		System.out.println("sum : "+sum);

	}

}
