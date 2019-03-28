package javaLec.ExInterface.ex04_IWeek;

import java.util.Scanner;

public class MeaningfulConst implements IWeek {
	public static void main(String[] args) {
		System.out.println("오늘의 요일을 선택하세요");
		System.out.println("1.월요일, 2.화요일, 3.수요일");
		System.out.println("4.목요일, 5.금요일, 6.토요일");
		System.out.println("7. 일요일");
		System.out.print("선택: ");
		Scanner scan = new Scanner(System.in);
		int sel = scan.nextInt();
		switch (sel) {
		case MON:
			System.out.println("주간회의가 있습니다.");
			break;
		case TUE:
			System.out.println("프로젝트 기획회의가 있습니다.");
			break;
		case WED:
			System.out.println("진행사항보고가 있습니다.");
			break;
		case THU:
			System.out.println("사내 축구시합이 있습니다.");
			break;
		case FRI:
			System.out.println("프로젝트 마감일입니다.");
			break;
		case SAT:
			System.out.println("가족과 여행을 떠납니다.");
			break;
		case SUN:
			System.out.println("오늘은 휴일입니다.");
			break;
		}
		scan.close();
	}
	
}
