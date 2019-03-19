/*import java.util.Scanner;

/* 짝수인지 홀수인지
 * 문자열을 리턴하는 매서드를 제작하세요
 * 5개의 정수 배열을 선언하세여
 * 배열에 정수 5개를 키보드로부터 입력받으세요
 * foreach 문을 사용해서 메서드에 배열을 입력하고
 * 결과값을 출력(짝수/홀수)하세요
 *  /
public class _051_0_JudgeTrueFalse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Judge(arr);
		InputArray(sc);
		sc.close();		
	}
	public static InputArray(Scanner sc) {
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"번째 정수 입력: ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static Judge(int[] arr) {
		for(int array : arr) {
			if(array%2==0)
				return "짝수입니다";
			else
				return "홀수입니다";
		}

	}
}
*/