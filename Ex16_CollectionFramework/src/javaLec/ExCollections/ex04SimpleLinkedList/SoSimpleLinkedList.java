package javaLec.ExCollections.ex04SimpleLinkedList;

import java.util.LinkedList;

// 단일 링크드 리스트 클래스
class Box<T> {
	T item; // 저장하고 싶은 값
	Box<T> nextBox; // 내 다음 공간을 가리키는 참조 변수

	void store(T item) {
		this.item = item;
	}

	T pullOut() {
		return item;
	}
}

//이중 링크드 리스트 클래스
//class Box<T> {
//	T item; // 저장하고 싶은 값
//	Box<T> prevBox; // 내 이전 공간을 가리키는 참조 변수
//	Box<T> nextBox; // 내 다음 공간을 가리키는 참조 변수
//	void store(T item) {this.item = item;}
//	T pullOut() {return item;}
//}

public class SoSimpleLinkedList {
	public static void main(String[] args) {

		Box<String> boxHead = new Box<String>();
		boxHead.store("First String");

		boxHead.nextBox = new Box<String>();
		boxHead.nextBox.store("Second String");

		boxHead.nextBox.nextBox = new Box<String>();
		boxHead.nextBox.nextBox.store("Third String");

		boxHead.nextBox.nextBox.nextBox = null;
		Box<String> dBox = boxHead;
		while (true) {
			if (dBox == null)
				break;
			System.out.println(dBox.pullOut());
			dBox = dBox.nextBox;
		}
	}
}
