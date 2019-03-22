﻿package exercise_190320;

/*1. 다음 클래스를 정의하세요
1) 어린아이가 가지고 있는 구슬 개수 정보를 담을 수 있다 > marble 변수
2) 놀이를 통한 구슬의 주고받음을 표현하는 메소드가 존재한다 > playMarble() 메소드
3) 어린이의 현재 구슬 개수를 출력하는 메소드가 존재한다. > printMarble() 메소드

main에서는 객체를 이렇게 만듭니다
  어린이1의 보유자산 -> 구슬 15개
  어린이2의 보유자산 -> 구슬 9개
  1차 놀이에서 어린이1은 어린이2의 구슬 2개를 획득한다
  2차 놀이에서 어린이2는 어린이 1의 구슬 7개를 획득한다
  마지막으로 각각의 어린이가 보유하고 있는 구슬의 수를 출력한다
  프로그램을 종료한다.*/
class Child {
	int marble;
	String name;
	static int playCount;	// 놀이 횟수 
							// 여러 객체에서 공유하기위해 Static
	
	Child(int num, String name) {
		marble = num;         // 멤버변수와 매개변수 이름이 다른 경우
		this.name = name;	  // 멤버변수와 매개변수 이름이 같은 경우
	}

	void playMarble(int num, Child child) {  // 구슬 개수, 빼앗길 어린이
		playCount++;  						 // 놀이 횟수
		System.out.println(
				String.format("%d차 놀이 : %s는 %s의 구슬 %d개를 획득한다", 
				playCount, name, child.name, num)
		);
		marble += num;						 // this 구슬 증가
		child.marble -= num;				 // 빼앗길 어린이 구슬 감소
	}

	void printMarble() { //출력
		System.out.println(String.format("%s의 현재 보유 구슬 갯수 : %d", name, marble));
	}

}

public class Advance_01 {
	public static void main(String[] args) {
		// 어린이 생성
		Child child1 = new Child(15, "수진이"); // 어린이1의 보유자산 -> 구슬 15개
		Child child2 = new Child(9, "희창이"); // 어린이2의 보유자산 -> 구슬 9개

		// 놀이
		child1.playMarble(2, child2); // 어린이1은 어린이2의 구슬 2개를 획득한다
		child2.playMarble(7, child1); // 어린이2는 어린이 1의 구슬 7개를 획득한다

		// 출력
		child1.printMarble();
		child2.printMarble();
	}
}
