package javaLec.ExCollections.ex03LinkedList;

import java.util.LinkedList;

/* 링크드 리스트 (동적 연결 리스트)
 * 1) 논리적으로 연속된 리스트 
 * 2) 필요할 때 공간을 할당하면 된다.
 * 3) 연속 검색은 Array보다 느리다
 * 4) 추가 : 객체 할당, 이전 Element에 새로운 객체 가리키게 함
 * 5) 삽입 : 객체 할당, 이전 Element 가 나를 가리키게 함,
 * 					 나는 다음 Element를 가리키게 함
 * 6) 삭제 : 이전 Element를 다음 Element를 가리키게 함
 * 7) 확장 : 추가와 동일함
 * 삽입/삭제와 같은 빈번한 데이터의 변경에 유리함
 * 정렬 시 이중 연결 리스트일 경우 Head와 Tail로부터 접근을 결정할 수 있고
 * 바로 jump는 안된다. (그냥 계속 따라가야 한다.) 
 * 
 * */
public class IntroLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		/** 데이터의 저장 */
		list.add(11);
		list.add(22);
		list.add(33);

		/** 데이터의 출력 */
		System.out.println("=====================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		/** 데이터의 삭제 */
		System.out.println("=====================");
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
