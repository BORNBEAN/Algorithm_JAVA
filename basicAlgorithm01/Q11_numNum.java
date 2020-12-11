package basicAlgorithm01;

import java.util.Scanner;

public class Q11_numNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int count = 0;
		System.out.print("양의 정수의 값: ");
		int num = sc.nextInt();
		
		while(num!=0) {
			count++;
			num /= 10;
		}
		System.out.println("그 수는 "+count+"자리입니다.");
	}
}
