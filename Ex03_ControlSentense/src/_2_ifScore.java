import java.util.Scanner;

/* 점수를 입력 받는다.
 * 90점 이상이면 A
 * 80점 이상이면 B
 * 70점 이상이면 C
 * 60점 이상이면 D
 * 60점 미만이면 F
 * */

public class _2_ifScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		String result = score >= 90 ? "A" : 
						score >= 80 ? "B" : 
						score >= 70 ? "C" : 
						score >= 60 ? "D" : "F";
		System.out.println(result);
		scan.close();
	}
}
