package exercise_190313;
import java.util.Scanner;

//7. 입력한 숫자의 부호를 바꾸어 출력하세요.
//1) 부호 연산자를 사용하세요
//2) 2의 보수법으로 부호를 바꾸세요
//	 컴퓨터는 2의 보수법을 사용하면 양수와 음수를 서로 바꿀 수 있습니다
//	 숫자의 비트를 반전하고 + 1을 하면 서로 부호가 바뀌게 됩니다
//	 비트반전연산자는 ~ 입니다
//	 ~num은 num의 비트가 반전된 값입니다.

public class ex_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = scan.nextInt();
		
//		num = ~num +1;
//		System.out.println(num);
		
		System.out.println(" 1) 부호 연산자를 사용하세요 : " + (-num));
		System.out.println(" 2) 2의 보수법으로 부호를 바꾸세요 : " + (~num+1));

		scan.close();
	}
}
