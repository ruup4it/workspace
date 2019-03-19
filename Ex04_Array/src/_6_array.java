import java.util.Arrays;
import java.util.Scanner;

/* 10명의 학생의 점수를 입력 받고자 한다.
 * 10개 배열을 선언하고
 * 10명의 점수를 입력 받고
 * 10명의 점수를 거꾸로 출력하세요
 * 총점과 평균도 출력하세요
 * */
public class _6_array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[10];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.print(String.format("점수를 입력하세요  %02d/10 : ",i+1));
			score[i] = scan.nextInt();
			sum += score[i];
		}
		avg = sum / score.length;
		System.out.println(Arrays.toString(score));
		for (int i = score.length-1; i >= 0; i--) {
			System.out.print(String.format("%d, ",score[i]));
		}
		System.out.println();
		System.out.println(String.format("총점 : %d \n평균 : %.2f", sum, avg));
		scan.close();
	}
}
