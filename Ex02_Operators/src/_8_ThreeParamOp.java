import java.util.Scanner;

// 사용자로부터 정수를 입력 받아라
public class _8_ThreeParamOp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0; String strNum="";
		
		System.out.println("정수를 입력하세요");
		num = scan.nextInt();
		
		strNum = num % 2 == 0 ? "짝수" : "홀수" ;
		
		System.out.println(strNum);
		scan.close();
	}
}
