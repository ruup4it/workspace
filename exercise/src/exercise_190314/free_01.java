package exercise_190314;

import java.util.Scanner;

/* 1. 
 * ���� �빮�ڸ� �Է¹޾� 
 * 'A'�̸� ��Excellent��, 
 * 'B'�̸� ��Good��, 
 * 'C'�̸� ��Usually��, 
 * 'D'�̸� ��Effort��, 
 * 'F'�̸� ��Failure��, 
 * �� �� �����̸� ��error�� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
