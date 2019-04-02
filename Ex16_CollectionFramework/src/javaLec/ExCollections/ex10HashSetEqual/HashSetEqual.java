package javaLec.ExCollections.ex10HashSetEqual;

import java.util.HashSet;
import java.util.Iterator;

/* HashSet은 내부적으로 같은 값인지 비교하는 2단계 절차가 있다.
 * 1) Object 클래스로부터 상속받은 hashCode() 메서드의 해시값을 비교
 * 2) Object 클래스로부터 상속받은 equals() 메서드의 반환 값을 비교
 * 우리가 사용하는 클래스를 사용하려면 2개 메서드를 overriding 해야 한다.
 * 
 * */
class SimpleNumber {
	int num;

	public SimpleNumber(int n) {
		num = n;
	}

	public String toString() {
		// retunr num+"";
		return String.valueOf(num);
	}

	public int hashCode() {
		return num;
	}

	public boolean equals(Object obj) {
		SimpleNumber comp = (SimpleNumber) obj;
		if (comp.num == num)
			return true;
		else
			return false;
	}
}

public class HashSetEqual {
	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();

		// 2번째 20 저장한 객체와 3번째 20저장한 객체는 hashcode가 다르다.
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));
		System.out.println("저장된 데이터 수 : " + hSet.size());
		Iterator<SimpleNumber> itr = hSet.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}
}
