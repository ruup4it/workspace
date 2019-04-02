package javaLec.ExCollections.ex11TreeSet;

import java.util.Iterator;
import java.util.TreeSet;
// Set이 단어가 나오면 중복 불가

public class SortTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> sTree = new TreeSet<Integer>();
		sTree.add(1);
		sTree.add(2);
		sTree.add(4);
		sTree.add(3);
		sTree.add(2);
		System.out.println("저장된 데이터 수 : " + sTree.size());
		Iterator<Integer> itr = sTree.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
