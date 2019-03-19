import java.util.Scanner;

/* while	: 몇 번 반복할 지 모르면
 * do~while	: 1 번은 실행하고 나서 판단하고 싶으면
 * for		: 시작과 끝이 명확하면
 * but 상호호환이 된다.
 * */

// 사용자로부터 숫자를 입력 받고
// 나무를 해당 숫자만큼 찍으세요
// 마지막으로 나무가 쿵 출력하세요
public class _6_while {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int inputNum = scan.nextInt();
		int count = 0;
		
		while(inputNum>0) {
			System.out.println(++count +"번 찍었습니다.");
			inputNum--;
		}
		System.out.println("나무가 쿵");
		scan.close();
	}
}
