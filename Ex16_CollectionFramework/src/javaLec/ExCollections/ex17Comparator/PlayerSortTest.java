package javaLec.ExCollections.ex17Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//다른 방식으로 정렬하고 싶을 때 구현
class PositionComparator implements Comparator<PlayerVO> {
	public int compare(PlayerVO p1, PlayerVO p2) {
		return p1.getPosition().compareTo(p2.getPosition());
	}
}

// 다른 방식으로 정렬하고 싶을 때 구현
class YearComparator implements Comparator<PlayerVO> {
	public int compare(PlayerVO p1, PlayerVO p2) {
		return p1.getRegYear() - p2.getRegYear();
	}
}

//Comparable은 default정렬
class PlayerVO implements Comparable<PlayerVO> {
	String name;
	String position;
	int regYear;

	PlayerVO(String name, String position, int regYear) {
		this.name = name;
		this.position = position;
		this.regYear = regYear;
	}

	public String toString() {
		return name + " : " + position + " : " + regYear;
	}

	@Override
	public int compareTo(PlayerVO other) {
		System.out.println("정렬 시도 [" + this.name + " VS " + other.name + "]");
		return this.name.compareTo(other.name);
	}

	int getRegYear() {
		return this.regYear;
	}
	
	String getPosition() {
		return this.position;
	}
}

public class PlayerSortTest {
	public static void arraySort() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAAA");
		list.add("FFFF");
		list.add("CCCC");
		list.add("1111");
		list.add("ZZZZ");
		list.add("EEEE");
		System.out.println("정렬 전 ");
		System.out.println(list);
		System.out.println("순차 정렬");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("역순 정렬");
		Collections.reverse(list);
		System.out.println(list);
	}

	public static void arrayPlayerVOSort() {
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		list.add(new PlayerVO("홍길동", "투수", 1999));
		list.add(new PlayerVO("임꺽정", "포수", 2005));
		list.add(new PlayerVO("강감찬", "1루수", 2003));
		list.add(new PlayerVO("을지문덕", "2루수", 2010));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

	public static void arrayPlayerVOSort2() {
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		list.add(new PlayerVO("홍길동", "투수", 1999));
		list.add(new PlayerVO("임꺽정", "포수", 2005));
		list.add(new PlayerVO("강감찬", "1루수", 2003));
		list.add(new PlayerVO("을지문덕", "2루수", 2010));
		System.out.println(list);
		Comparator comparator = new YearComparator();
		Collections.sort(list, comparator);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
	
	public static void arrayPlayerVOSort3() {
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		list.add(new PlayerVO("홍길동", "투수", 1999));
		list.add(new PlayerVO("임꺽정", "포수", 2005));
		list.add(new PlayerVO("강감찬", "1루수", 2003));
		list.add(new PlayerVO("을지문덕", "2루수", 2010));
		System.out.println(list);
		Comparator comparator = new PositionComparator();
		Collections.sort(list, comparator);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

	public static void main(String[] args) {
		// arraySort();
		// arrayPlayerVOSort();
		//arrayPlayerVOSort2();
		arrayPlayerVOSort3();

	}
}
