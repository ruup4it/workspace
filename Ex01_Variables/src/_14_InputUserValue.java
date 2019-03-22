import java.util.Scanner;
//import java.util.*; // java.util 내의 모든 걸 import

public class _14_InputUserValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();

		System.out.println("문자를 입력하세요");
		String string = scan.next();
		
		System.out.println(num);
		System.out.println(string);
		scan.close();
	}
}
