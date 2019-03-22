package exercise_190314;

import java.util.Scanner;

/*
 * 2. 정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.
 * 1) while 버전
 * 2) for 버전
 * 3) do while 버전
*/
public class free_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i ++) {
			sum += i * 5;
			//System.out.println(i * 5);
		}
		System.out.println("5의 배수의 합 : " + sum);
		scan.close();
	}
}
