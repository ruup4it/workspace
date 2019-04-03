package javaLec.ExCollections.ex08HashSet;

import java.util.HashSet;
import java.util.Iterator;

/* HashSet
 * 1) hash 알고리즘(데이터베이스에서도 사용)을 사용한다.
 * 2) 중복 불가능
 * 3) 임의의 검색이 가장 빠른 구조
 * 4) 작은 데이터는 큰데이터를 일정한 크기로 알고리즘에 변환
 * -> 자기 위치에 저장
 * 5)  hash로만 변환되면 바로 데이터 위치를 찾아 간다.
 * 6) 일괄 출력배보면 hash 순서대로 저장된다.
 * 검색에 가장 유리한 구조
 * 
 * */
public class SetInterface {
	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("First");
		hSet.add("Second");
		hSet.add("Third");
		hSet.add("First");
		System.out.println("저장된 데이터 수 : " + hSet.size());
		Iterator<String> itr = hSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
