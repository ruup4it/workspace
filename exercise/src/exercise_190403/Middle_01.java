package exercise_190403;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

//1. 지명과 위치 정보를 저장하고 관리하고자 한다. 지명은 String타입으로, 위치 정보를
//위도와 경도를 가진 Location이라는 클래스로 선언하고, 지명을 '키'로 하여
//HashMap<String, Location>에 키보드로 입력받아 5개의 요소를 저장하고, 지명으로
//검색하는 프로그램을 작성하라.
class Location {
	String name;
	double x;
	double y;

	Location(double x, double y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}
}

public class Middle_01 {
	public static void main(String[] args) {
		HashMap<String, Location> hmap = new HashMap<String, Location>();
		Scanner scan = new Scanner(System.in);
		String locationName;
		double x;
		double y;
		for (int i = 0; i < 2; i++) {
			System.out.print("지명을 입력하세요 : ");
			locationName = scan.nextLine();
			System.out.print("위도를 입력하세요 : ");
			x = scan.nextDouble();
			scan.nextLine();
			System.out.print("경도를 입력하세요 : ");
			y = scan.nextDouble();
			scan.nextLine();
			hmap.put(locationName,new Location(x,y,locationName));
		}
		
		System.out.print("검색하실 지명을 입력하세요 : ");
		String search = scan.nextLine();
		Iterator<String> itr = hmap.keySet().iterator(); // Iterator 생성

		while (itr.hasNext()) { // 값이 있다면
			String key = itr.next();
			if(search.equals(key)) {
				System.out.println("지명 : " + key);
				System.out.println("위도 : " + hmap.get(key).x);
				System.out.println("경도 : " + hmap.get(key).y);
			}
		}
		
		scan.close();
	}
}
