package javaLec.ExCollections.ex05IteratorUsage;

import java.util.Iterator;
import java.util.LinkedList;

/* Iterator는 여러 자료구조를 동일하게 접근하는 목적으로
 * 만들어진 클래이다.
 * 자료구조의 변경이 필요할 때 접근 루틴은 손댈필요 없고
 * 해당 자료구조(컬렉션)만 바꾸면 되기 때문에
 * 컬렉션의 전환이 상대적으로 용이해진다.
 * Iterator는 시작부터 끝까지 접근하는데 일반적으로 사용된다.
 * */
public class IteratorUsage_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");

		Iterator<String> itr = list.iterator();
		System.out.println("----------------------");
		while (itr.hasNext()) {
			String curStr = itr.next();
			System.out.println(curStr);
			if (curStr.compareTo("Third") == 0)
				itr.remove();
		}
		System.out.println("----------------------");
		itr = list.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
