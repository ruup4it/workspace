package exercise_190402;


import java.util.HashMap;
import java.util.Scanner;
//1. 키보드로 10개의 나라 이름과 인구를 입력받아 저장하고, 다시 나라 이름을 키보드로부터
//입력받아 인구를 출력하는 프로그램을 다음과 같이 해시맵을 이용하여 작성하라.
//HashMap<String, Integer> nations = new HashMap<String, Integer>();

public class Basic_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		for(int i =0; i<3; i++) {
			System.out.print("==========[ "+(i+1)+"/10 ]==========나라 이름을 입력하세요 : ");
			String country = scan.nextLine();
			System.out.print("인구 수를 입력하세요 : ");
			int population =scan.nextInt();
			scan.nextLine();
			nations.put(country, population);
		}
		System.out.println("입력 끝!");
		
		System.out.print("나라 이름을 입력하세요 : ");
		System.out.println(nations.get(scan.nextLine()));
		scan.close();
	}
}
