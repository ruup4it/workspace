package exercise_190313;

import java.util.Scanner;

/*
 * 2. 영문자를 입력받습니다
소문자는 대문자로, 대문자는 소문자로 변경해서 출력하세요 
(조건 연산자를 사용하세요)
(아스키테이블을 참조하면 됩니다)
*/

/*소문자와 대문자의 아스키 코드의 차이가 32인것을 활용한다.
A -> a : 32를 더한다.
a -> A : 32를 뺀다.

알파벳 아스키 코드는 다음과 같다. 알파벳은 총 26개 문자로 되어 있음. 
A-65  Z-90  a-97  z-122 */


public class ex_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("영문자를 입력하세요");
		
		char ch = scan.next().charAt(0);
		
		char result = ch;
		result = ch >= 65 && ch <= 90 ? result += 32
				: ch >= 97 && ch <= 122 ? result -= 32 : 0;
		if (result == 0) {
			System.out.println("잘못입력하셨습니다" ); 
		}
		System.out.println("입력하신 문자 "+ ch + " -> " + result ); 
		scan.close();
	}
}
