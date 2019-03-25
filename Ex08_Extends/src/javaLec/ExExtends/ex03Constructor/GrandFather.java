package javaLec.ExExtends.ex03Constructor;

/*
 * 아무런 표시가 없는 클래스는
 * 무조건 java.lang.Object의 상속을 받는다.
 */
public class GrandFather {
	int handsomeScore = 10;
	
	GrandFather(){
		System.out.println("GrandFather 생성자");
	}

	void handsome() {
		System.out.println("잘생겼다.");
	}
}
