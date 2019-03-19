package exercise_190313;

import java.util.Scanner;

// 6. 정수 num를 입력받습니다
// (num x 4)/8 을 비트이동연산자를 사용하여 계산하고
// 결과값은 소수점까지 출력하도록 하세요
public class ex_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		int num = scan.nextInt();
		
		num = num << 2; // *4
		num = num >> 3; // *1/8
		
		System.out.println((double)num);
		scan.close();
	}
	
}
