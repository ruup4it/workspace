package javaLec.ExCollections.ex15TreeMap;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class IntroTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(1, "data1");
		tMap.put(3, "data3");
		tMap.put(5, "data5");
		tMap.put(2, "data2");
		tMap.put(4, "data4");

		NavigableSet<Integer> navi = tMap.navigableKeySet(); // 오름차순, 내림차순
		System.out.println("오름차순 출력...");
		Iterator<Integer> itr = navi.iterator();
		while (itr.hasNext()) {
			System.out.println(tMap.get(itr.next()));
		}
		System.out.println("5번 삭제");
		tMap.remove(5);
		System.out.println("내림차순 출력...");
		itr = navi.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(tMap.get(itr.next()));
		}
		
//		System.out.println(tMap.get(2));
//		System.out.println(tMap.get(5));
//		System.out.println(tMap.get(3));

//		System.out.println("삭제 후 : " + tMap.get(5));
	}
}
