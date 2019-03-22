import java.util.Scanner;

/* 짝수인지 홀수인지 
 * 문자열을 리턴하는 메서드를 제작하고
 * 5개의 정수 배열을 선언하세요
 * 배열에 정수 5개를 키보드로부터 입력 받으세요
 * foreach문을 사용해서 메서드에 배열을 입력하고
 * 결과값을 출력 (짝수/홀수)하세요
 * */
public class _05_JudgeTrueFalse {

	public static void main(String[] args) {
		final int ARRAYLENTH = 5;
		int[] arr = inputArray(ARRAYLENTH);// 입력메서드
		String[] arrResult = isOddOrEven(arr);// 계산 메서드
		printResult(arrResult);// 출력 메서드
	}

	private static int[] inputArray(int length) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[length];
		int count = 0;
		for (@SuppressWarnings("unused") int item : arr) {
			System.out.println("정수를 입력하세요");
			arr[count] = scan.nextInt();
			count++;
		}
		scan.close();
		return arr;
	}

	private static String[] isOddOrEven(int[] arr) {
		String[] arrResult = new String[arr.length];
		int count = 0;
		for(int item : arr) {
			if (item % 2 == 0)
				arrResult[count] = "짝수";
			else
				arrResult[count] = "홀수";
			count++;
		}
		return arrResult;
	}

	private static void printResult(String[] arrResult) {
		for(String item : arrResult) {
			System.out.print(item+ " ");
		}
	}

}
