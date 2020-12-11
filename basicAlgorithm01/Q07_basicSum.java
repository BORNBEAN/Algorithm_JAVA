package basicAlgorithm01;

import java.util.Scanner;

public class Q07_basicSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.print(i);
			sum = sum + i;
			if (i==n) System.out.print(" = ");
			else System.out.print(" + ");
		}
		
		System.out.println(sum);
	}
	

}
