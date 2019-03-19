import java.util.Scanner;

// 3명의 점수를 입력 받고 총합과 평균을 출력하세요
// 소수점 2번째 자리까지 반올림 
// String.format("%.2f", 변수 or 값)
public class _15_sumAVG {
	public static void main(String[] args) {
		double score1 = 0, score2 =0, score3 = 0, sum = 0, avg = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 점수를 입력하세요.");
		score1 = scan.nextDouble();
		
		System.out.println("두 번째 점수를 입력하세요.");
		score2 = scan.nextDouble();

		System.out.println("세 번째 점수를 입력하세요.");
		score3 = scan.nextDouble();
		
		sum = score1 + score2 + score3;
		avg = sum/3;
		
		System.out.println("총합은 " + String.format("%.0f", sum) + "입니다.");
		System.out.println("평균은 " + String.format("%.2f", avg) + "입니다.");
		
		scan.close();
	}
}
