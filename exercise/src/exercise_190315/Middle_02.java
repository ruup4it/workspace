package exercise_190315;

import java.util.Scanner;

//2. 0보다 큰 정수를 입력받고 이진수와 16진수로 출력하세요
public class Middle_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0보다 큰 정수를 입력하세요 : ");
		int num = scan.nextInt();
		if (num < 0)
			System.out.println("잘못입력하셨습니다.");
		else {
			System.out.println(num + "의 2진수 값 : " + Integer.toBinaryString(num));
			System.out.println(num + "의 16진수 값 : " + Integer.toHexString(num));
		}
		scan.close();
	}
}
