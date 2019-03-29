package javaLec.ExException.ex01_ifException;

import java.util.Arrays;
import java.util.Scanner;
/* C언어 시절에는 예외처리를 if문으로 처리했다.
 * 단점이 실행 코드와 예외 처리가 지나치게 반복되고
 * 실행 코드보다 예외 처리 코드가 훨씬 더 많아지게 되었다.
 * 그러므로 코드의 가독성이 낮아지는 결과도 생겼다.
 * 그래서 C++은 실행 코드 영역과 예외 처리 영역을 분리하는 
 * 예외 처리 라는 문법을 도입하였다.
 * Java는 C++을 모태로 탄생 되었고, 
 * C++에 비해서 예외처리를 훨씬 더 강화하였고 잘 설계하였다.
 * */
public class  ExceptionHandlerUseIf{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		for (int i = 0; i < 3; i++) {
			System.out.println("피제수 숫자 입력");
			int num1 = sc.nextInt();
			System.out.println("제수 숫자 입력");
			int num2 = sc.nextInt();
			if (num2 == 0) {
				System.out.println("제수는 0이 될 수 없습니다.");
				i--;
				continue;
			}
			System.out.println("연산 결과를 저장할 배열 인덱스 입력");
			int idx = sc.nextInt();
			if (idx < 0 || idx > 99) {
				System.out.println("유효하지 않은 인덱스입니다.");
				i--;
				continue;
			}
			arr[idx] = num1 / num2;
			System.out.println("나눗셈 결과는 " + arr[idx]);
			System.out.println("저장된 위치의 인덱스는 " + idx);
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
