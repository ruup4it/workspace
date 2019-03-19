import java.util.Scanner;

/* 숫자를 입력 받고 짝수인지 홀수인지
 * 문자열을 리턴하는 메서드를 제작하고
 * 사용해보세요
 * */
public class _04_JudgeTrueFalse {
	public static void main(String[] args) {
		int num = inputNum(); // 입력 받는 메서드
		String result = isOddOrEven(num);// 짝수 홀수 판단하는 메서드
		printResult(result);// 출력 메서드
	}

	private static int inputNum() {
		Scanner scan = new Scanner(System.in);
		int numForInput = 0;
		System.out.print("정수를 입력하세요");
		numForInput = scan.nextInt();
		scan.close();
		return numForInput;
	}

	private static String isOddOrEven(int num) {
		//String returnString = "";
		if(num%2 ==0) 
			return String.format("입력하신 정수 : %d \n결과 : 짝수입니다.", num);
			//returnString = String.format("입력하신 정수 : %d \n결과 : 짝수입니다.", num);
		else 
			return  String.format("입력하신 정수 : %d \n결과 : 짝수입니다.", num);
			//returnString = String.format("입력하신 정수 : %d \n결과 : 홀수입니다.", num);
		//return returnString;
	}

	private static void printResult(String result) {
		System.out.println(result);
	}
}
