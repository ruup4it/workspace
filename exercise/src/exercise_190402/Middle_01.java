package exercise_190402;
//1. Scanner 를 사용하여 5개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아

//ArrayList에 저장하고, ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, 
//D=1.0, F=0)로 변환하여 출력하는 프로그램을 작성하라.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Score {
	double doubleScore;
	char chScore;

	Score(char chScore) {
		this.chScore = chScore;
		switch (chScore) {
		case 'A':
			doubleScore = 4.0;
			break;
		case 'B':
			doubleScore = 3.0;
			break;
		case 'C':
			doubleScore = 2.0;
			break;
		case 'D':
			doubleScore = 1.0;
			break;
		case 'F':
			doubleScore = 0;
			break;
		}
	}
	
	public String toString() {
		return "======================\n"+doubleScore+"입니다.";
	}
}

public class Middle_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Score> arrList = new ArrayList<Score>();

		// 입력 받기
		for (int i = 0; i < 2; i++) {
			System.out.print("==========[ " + (i + 1) + "/5 ]==========\n'A', 'B', 'C', 'D', 'F'\n학점을 입력하세요 : ");
			char population = scan.nextLine().charAt(0);
			scan.nextLine();
			arrList.add(new Score(population));
		}

		System.out.print("검색하실 값을 입력하세요 : ");
		char search = scan.nextLine().charAt(0);
		Iterator<Score> itr = arrList.iterator(); // Iterator 생성

		while (itr.hasNext()) { // 값이 있다면
			Score curStr = itr.next();
			if(search == curStr.chScore) {
				System.out.println(curStr);
			}
		}
		scan.close();
	}
}
