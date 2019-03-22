package exercise_190314;

import java.util.Scanner;

//8. 사용자로부터 정수를 입력받습니다.
//입력 받은 값을 계속 더합니다
//사용자가 0을 입력하면 합을 출력합니다
//프로그램을 종료합니다.
public class doWhile08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		do {
			System.out.print("정수를 입력하세요 : ");
			num = scan.nextInt();
			sum += num;
		} while (num != 0);
		System.out.println(String.format("합계 : %d",sum));
		scan.close();
	}

}
