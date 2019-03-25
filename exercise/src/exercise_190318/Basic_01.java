package exercise_190318;

import java.util.Scanner;

//1. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드와
//이 메서드를 사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
//절대값이 계산되어서 출력되어야 합니다
public class Basic_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			result = num1-num2;
		} else {
			result = num2-num1;
		}
		System.out.println(String.format("두 수의 차의 절댓값은 %d입니다.", result));
		
		scan.close();
	}

}
