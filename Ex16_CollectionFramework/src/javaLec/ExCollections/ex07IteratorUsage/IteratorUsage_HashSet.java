package javaLec.ExCollections.ex07IteratorUsage;

import java.util.HashSet;
import java.util.Iterator;

/* Iterator는 여러 자료구조를 동일하게 접근하는 목적으로
 * 만들어진 클래이다.
 * 자료구조의 변경이 필요할 때 접근 루틴은 손댈필요 없고
 * 해당 자료구조(컬렉션)만 바꾸면 되기 때문에
 * 컬렉션의 전환이 상대적으로 용이해진다.
 * Iterator는 시작부터 끝까지 접근하는데 일반적으로 사용된다.
 * */
public class IteratorUsage_HashSet {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");

		Iterator<String> itr = set.iterator(); // Iterator 생성
		System.out.println("----------------------");
		while (itr.hasNext()) { // 값이 있다면
			String curStr = itr.next();
			System.out.println(curStr);	// 찍어주고
			if (curStr.compareTo("Third") == 0)
				itr.remove();
		}
		System.out.println("----------------------");
		itr = set.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
