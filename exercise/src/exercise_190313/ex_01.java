package exercise_190313;

import java.util.Scanner;
// 1. 영문자를 입력받습니다
// 소문자인지 대문자인지 판별하세요 (조건 연산자를 사용하세요)

/*  자바 Scanner에서 char 를 바로 입력 받는 건 없음
 *	1) char chr = sc.next().charAt(0);
 *	2) char chr = sc.next().trim().charAt(0);
 */

/*"아스키코드(ASCII)" 
대문자 A~Z까지의 아스키코드값은 65~90이다.
대문자 A : 65
대문자 Z : 90

소문자 a~z까지의 아스키코드값은 97~122이다.
소문자 a : 97
소문자 z : 122*/

//대문자 
//1) 65<= char <=90 
//2) 'A'<= char <='Z' 
//소문자
//1) 97<= char <= 122 
//2) 'a'<=char <'z' 

public class ex_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";

		System.out.println("영문자를 입력하세요");
		char ch = scan.next().charAt(0);

		result = (int) ch >= 65 && (int) ch <= 90 ? "입력하신 영문자 " + ch + "는 대문자입니다."
				: (int) ch >= 97 && (int) ch <= 122 ? "입력하신 영문자 " + ch + "는 소문자입니다." : "잘못 입력하셨습니다.";

		System.out.println(result);
		
		scan.close();
	}

}
