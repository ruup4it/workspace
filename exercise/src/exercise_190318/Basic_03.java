package exercise_190318;

import java.util.Scanner;

/* 3.두개의 실수(double)을 입력받아
 * 각각 +, -, *, / 를 하여 반환하는
 * 메서드를 4개 제작하고 사용해보세요
 * */
public class Basic_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num4 = inputNum(scan); // 실수를 입력받는 메서드 호출
		double num5 = inputNum(scan); // 실수를 입력받는 메서드 호출
		printPlus(num4, num5);// 입력받은 실수로 연산하는 메서드 호출

		double result = printMinus(num4, num5);
		// System.out.println("빼기 결과값은 "+result+"입니다.");
		printResult(result);

		System.out.println("곱하기 결과값은 " + printMultiple(num4, num5) + "입니다.");

		printResult(printDivision(num4, num5));
		scan.close();
	}

	public static double printDivision(double num1, double num2) {
		return num1 / num2;
	}

	// 입력받은 실수로 연산하는 메서드 선언 +
	public static void printPlus(double num1, double num2) {
		// int result = 0;
		// result = num1+num2;
		//System.out.println("더하기 : 결과값은 " + result + "입니다.");
		System.out.println("더하기 : 결과값은 " + (num1 + num2) + "입니다.");
	}

	// 입력받은 실수로 연산하는 메서드 선언 -
	public static double printMinus(double num1, double num2) {
		double result = 0;
		result = num1 - num2;
		return result;
	}

	// 입력받은 실수로 연산하는 메서드 선언 *
	public static double printMultiple(double num1, double num2) {
		return num1 * num2;
	}

	// 실수를 입력받는 메서드 선언
	public static double inputNum(Scanner scan) {
		System.out.println("실수를 입력하세요");
		double num = scan.nextDouble();
		return num;
	}

	// 출력하는 메서드
	public static void printResult(double result) {
		System.out.println("결과값은" + result + "입니다.");
	}

}
