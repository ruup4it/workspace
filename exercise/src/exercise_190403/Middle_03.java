package exercise_190403;

import java.math.BigDecimal;
import java.util.Scanner;

//3. 프로그램 사용자로부터 두 개의 실수를 입력 받은 후, 두 실수의 차에 대한 절대값을
//계산하여 출력하는 프로그램을 작성하자. 단 오차가 존재하지 않아야 하며, 문제의 
//해결을 위해서 반드시 BigDecimal을 참조하세요
public class Middle_03 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("첫 번째 실수를 입력하세요");
		BigDecimal b1 = scan.nextBigDecimal();
		System.out.println("두 번째 실수를 입력하세요");
		BigDecimal b2 = scan.nextBigDecimal();
		BigDecimal check = new BigDecimal(-1);
		BigDecimal result = b1.subtract(b2);
		
		if(b1.compareTo(b2)==-1) {
			result = result.multiply(check);
		}
		
		System.out.println();
		System.out.println("두 실수의 뺄셈의 절대값 : " + result);
	}
}
