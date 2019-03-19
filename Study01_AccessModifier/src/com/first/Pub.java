package com.first;
// 같은 패키지 내의 다른 클래스에서 사용 가능 
public class Pub {
	public static void main(String[] args) {
		// AAA 클래스의 객체인 pub를 생성
		AAA pub = new AAA();
		
		// 객체 pub의 멤버변수 pubInt를 출력
		System.out.println(pub.pubIntA);
	}
	
}
