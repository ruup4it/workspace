import java.util.Scanner;

/* 원의 반지름을 입력받는다
 * 원의 넓이 구하는 매서드 제작
 * 원의 둘레 구하는 매서드 제작
 */
public class _09_CircleArea {
	public static void main(String[] args) {
		// 변수 영역
		double r=0, area=0, round=0;
		// 매서드 영역
		r = inputRadius(r);
		calcArea(r);
		calcRound(r);
		area = calcArea(r);
		round = calcRound(r);
		System.out.println("원의 넓이는 "+area+"입니다");
		System.out.println("원의 넓이는 "+round+"입니다");
		
	}
	// 반지름 입력받는 매서드
	public static double inputRadius(double r2) {

		Scanner sc = new Scanner(System.in);
		System.out.println("반지름의 길이 입력: ");
		double r = sc.nextDouble();
		return r;
	}
	public static double calcArea(double r) {
		return r*r*3.14;
	}
	public static double calcRound(double r) {		
		return 2*r*3.14;
	}
}
