package exercise_190314;

import java.util.Scanner;

/* 1. 
 * 영문 대문자를 입력받아 
 * 'A'이면 “Excellent”, 
 * 'B'이면 “Good”, 
 * 'C'이면 “Usually”, 
 * 'D'이면 “Effort”, 
 * 'F'이면 “Failure”, 
 * 그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.
*/
public class free_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.nextLine().charAt(0);
		String result = "";
		
		if(ch=='A') {
			result = "Excellent";
		} else if (ch=='B') {
			result = "Good";
		} else if (ch=='C') {
			result = "Usually";
		} else if (ch=='D') {
			result = "Effort";
		} else if (ch=='F') {
			result = "Failure";
		} else {
			result = "error";
		}
		
//		switch(ch) {
//			case 'A' :
//				result = "Excellent";
//				break;
//			case 'B' :
//				result = "Good";
//				break;
//			case 'C' :
//				result = "Usually";
//				break;
//			case 'D' :
//				result = "Effort";
//				break;
//			case 'F' :
//				result = "Failure";
//				break;
//			default:
//				result = "error";
//				break;
//		}
//	
		System.out.println(result);
		scan.close();
	}
}
