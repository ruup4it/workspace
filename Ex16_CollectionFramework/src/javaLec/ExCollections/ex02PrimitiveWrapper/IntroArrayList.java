package javaLec.ExCollections.ex02PrimitiveWrapper;

import java.util.ArrayList;

/* Array 구조
 * 1) 물리적으로 연속적인 구조를 가진다.
 * 2) 순차적인 데이터 추가나 순차적인 출력에서는 가장 빠른 구조
 * 3) 검색 : 운 나쁘면 가장 뒤에서 찾는다.
 * 4) 삽입 : 중간에 넣을 때 뒤에 있는 데이터를 전부 뒤로 밀어야 함
 * 5) 삭제 : 중간 값을 삭제 할 때 뒤에 있는 데이터를 전부 앞으로 당겨야 함
 * 6) 확장 : 물리적을 연속된 공간을 확보하지 못하면 새로운 공간에 할당하고
 * 			전부 복사한다.
 * */
public class IntroArrayList {
	// Java에서 범용적으로 모든 클래스를 인자로 받는 메서드는
	// Object인 경우가 많다.
	public static void printInfo(Object obj) {
		System.out.println(obj.getClass() + " : " + obj);
	}

	public static void main(String[] args) {
		// 내부 구조가 배열이다
		// 단, 데이터가 늘어나면 알아서 새로운 배열을 할당한다.
		ArrayList<Integer> list = new ArrayList<Integer>();

		/**
		 * 데이터의 저장 /** 클래스가 들어가야하므로 primitive 타입 말고 Integer타입으로 저장
		 */
		list.add(11); // JDK 1.5 이후 부터 Primitive -> Integer 자동 변환
		list.add(22);
		list.add(33);

		/** 데이터 출력 */
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		/** 데이터 삭제 */
		/** array의 특성상 해당이후의 배열을 전부 1칸씩 앞으로 당긴다 */

		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getClass());
		}

		System.out.println("-----------------------------");
		// JDK 1.5 이후 부터 Primitive -> Integer 자동 변환
		printInfo(new Integer(100)); // JDK 1.5 이전
		printInfo(100); // JDK 1.5 이후

		Integer classType = new Integer(100);
		printInfo(classType);

		Integer primitiveType = 100;
		printInfo(primitiveType);
	}
}
