import java.util.Arrays;
import java.util.Scanner;

/* 배열 (Array)
 * 配 짝지을 배 : 짝
 * 列 벌일 열 : 나란히 줄 서있다.
 * 같은 종류의 자료형끼리 연속되어 선언된다.
 * ex) 학생들의 국어 점수
 */

// 학생 5명의 국어 점수
public class _1_array {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] korScore = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.print(String.format("점수를 입력하세요 (%d/5): ", i+1));
			korScore[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(korScore));
		scan.close();
	}
}
