package exercise_190402;

//2. 링크드리스트를 모델로 하는 
//Linked_List<E> 를 구현하세요
//메서드는 아래를 구현하세요
//1)추가
//2)삭제
//3)삽입
//노드

//노드
class Node<E> {
	E data; // 데이터
	Node<E> next; // 뒤쪽 포인터(다음 노드 참조)

	// 생성자
	Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}
}

class LinkedList<E> {
	private Node<E> head; // 머리 노드
	private Node<E> crnt; // 선택 노드

	// 생성자
	public LinkedList() {
		head = crnt = null;
	}

	// 꼬리에 노드 추가
	public void add(E obj) {
		if (head == null) // 리스트가 비어 있으면
			addFirst(obj); // 머리에 삽입
		else {
			Node<E> ptr = head;
			while (ptr.next != null)
				ptr = ptr.next;
			ptr.next = crnt = new Node<E>(obj, null);
		}
	}

	// 머리에 노드 삽입
	public void addFirst(E obj) {
		Node<E> ptr = head; // 삽입 전의 머리 노드
		head = crnt = new Node<E>(obj, ptr);
	}

	// 머리 노드 삭제
	public void removeFirst() {
		if (head != null) // 리스트가 비어 있지 않으면
			head = crnt = head.next;
	}

	// 꼬리 노드 삭제
	public void remove(int count) {
		Node<E> ptr = head; // 스캔 중인 노드
		Node<E> pre = head; // 스캔 중인 노드의 앞쪽 노드
		if (head != null) {
			if (head.next == null) // 노드가 하나만 있으면
				removeFirst(); // 머리 노드를 삭제
			else {
				for (int i = 0; i < count; i++) {
					crnt = ptr;
					pre = ptr;
					ptr = ptr.next;
				}
				pre.next = null; // pre는 삭제 후의 꼬리 노드
				crnt = pre;
			}
		}
	}

	// 모든 노드를 삭제
	public void clear() {
		while (head != null) // 노드에 아무것도 없을 때까지
			removeFirst(); // 머리 노드를 삭제
		crnt = null;
	}

	// 선택 노드를 하나 뒤쪽으로 이동
	public boolean next() {
		if (crnt == null || crnt.next == null)
			return false; // 이동할 수 없음
		crnt = crnt.next;
		return true;
	}

	// 선택 노드를 출력
	public void printCurrentNode() {
		if (crnt == null)
			System.out.println("선택한 노드가 없습니다.");
		else
			System.out.println(crnt.data);
	}

	// 모든 노드를 출력
	public void dump() {
		Node<E> ptr = head;

		while (ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
}

public class Advance_02 {
	public static void main(String[] args) {
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		// 추가
		Integer int1 = new Integer(2);
		Integer int2 = new Integer(4);
		Integer int3 = new Integer(8);

		linkList.add(int1);
		linkList.add(int2);
		linkList.add(int3);
		linkList.dump();
		// 삭제
		linkList.remove(3);
		// 삽입
		linkList.dump();

	}
}
