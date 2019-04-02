package javaLec.ExCollections.ex13Comparable;

import java.util.Iterator;
import java.util.TreeSet;

/* 정렬의 순서를 우리가 정하려면 Comparable 상속을 받는다.
 * */
class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showData() {
		System.out.printf("%s %d \n", name, age);
	}

	public int compareTo(Person p) {
		if (name.length() > p.name.length())
								//return -1; : 내림차순
			return 1;			// 오름차순
		else if (name.length() < p.name.length())
								// return 1; : 내림차순
			return -1;			// 오름차순
		else
			return 0;
	}
}

public class ComparablePerson {
	public static void main(String[] args) {
		TreeSet<Person> sTree = new TreeSet<Person>();
		sTree.add(new Person("Raspberry", 23));
		sTree.add(new Person("Melon", 27));
		sTree.add(new Person("Strawberry", 21));
		sTree.add(new Person("Orange", 28));
		Iterator<Person> itr = sTree.iterator();
		while (itr.hasNext())
			itr.next().showData();
	}
}
