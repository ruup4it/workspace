package javaLec.ExInterface.ex03_IMP3;

import java.util.Random;

/* 5) Camp는 IMP3를 인자로 받아서
 * MP3TestManager 클래스의 구현을 마쳤고
 * A, B, C 는 각각 interface로 의뢰를 받아 구현을 마쳤다.
 * 구현을 마친 클래스를 Camp로 보내와 테스트를 시작한다.
 * */

/* 클래스의 3가지 종류
 * 1) 구현 클래스 : 현재 선택한 역할로 구현이 모두 가능할 때
 * 				  만일 상속을 전제로 한다면, 자식 클래스들이 
 * 				  특별히 많이 손 안대도 되는 공통적인 기능을 구현
 * 
 * 2) 추상 클래스 : 일부는 공통된 기능 구현 가능하지만 
 * 				  일부는 자식이 알아서 결정해야할 때
 * 		
 * 3) 인터페이스  : 하나도 구현할 게 없고 미리 메서드만 정의해 놓을 때
 * 				 클래스 간의 규약을 정해 연결할 때 (유연성)
 * */

/* 상속의 종류
 * 1) 클래스 상속 (extends) 
 * 	: 하위 분류(A)는 상위 분류(B)의 한 종류이다.
 * 	  A is a kind of B
 * 2) 인터페이스 상속(구현) (implements) 
 * 	: 구현 클래스는 인터페이스 할 수 있어야한다.
 * 	  (Framework, java Language)
 * 	   A is able to B
 *     AutoCloseable, Appendable, Cloneable, Runnable
 *     상속받아 구현하면 자바의 다른 객체가 이 규약에 의해 호출하게된다. (기능 제공)
 * */
public class MP3Main {

	public static void main(String[] args) throws InterruptedException {
		// 1) A가 먼저 제품을 보내왔다.
		AMP3 aMp3 = new AMP3();

		// 2) BCamp는 A의 mp3를 테스트하기 위해서
		// MP3TestManager객체를 만든다.
		MP3TestManager mp3Tm = new MP3TestManager(aMp3);
//		mp3Tm.listenTest();
//		mp3Tm.playTest();
//		mp3Tm.viewTest();

		// 3) 마침 B와 C도 mp3를 보내왔다
		// 함께 테스트 해보자
		IMP3[] mp3s = new IMP3[] { aMp3, new BMP3(), new CMP3() };
		String[] company = new String[] { "A", "B", "C" };
		int temp = 0;
		for (IMP3 mp3 : mp3s) {
			System.out.print(company[temp] + "회사\n");
			mp3Tm.allTest(1);
			mp3Tm.setMP3(mp3);
			System.out.println();
			temp++;
			
//			mp3Tm.listenTest();
//			mp3Tm.playTest();
//			mp3Tm.viewTest();
//			System.out.println("--------------------");

		}

		Random rand = new Random();
		int sel = rand.nextInt(2);
		if (sel == 0)
			System.out.println("A를 선택");
		else if (sel == 1)
			System.out.println("B를 선택");

	}
}
