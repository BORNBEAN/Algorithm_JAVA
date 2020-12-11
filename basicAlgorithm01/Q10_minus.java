package basicAlgorithm01;

import java.util.Scanner;

public class Q10_minus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		int b=0;
		boolean check = false;
		
		while(!check) {
			System.out.print("b의 값: ");
			b = sc.nextInt();
			if(b>a)
				check=true;
			else
				System.out.println("a보다 큰 값을 입력하세요");
		}
		
		System.out.println("b-a는 "+(b-a)+" 입니다.");
		
	}
}
