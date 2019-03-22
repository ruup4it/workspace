package javaLec._class.ex07Package;

import javaLec._class.ex08Package.Triangle;
/* <패키지란?>
 * 1) package는 class보다 상위 분류 개념이며
 *    동시에 폴더 구조이다.
 * 2) class 제작 시 별도의 package명을 주지 않으면
 *    default pakage 소속이 된다.
 * 3) 다른 package의 클래스를 사용하고 싶으면 import를 한다.
 *    단축키는 Ctrl + Shift + o
 * 4) import 없이 사용할 수 있는 package는 
 *    자기 자신이 속한 package와 java.lang이다.
 * 5) java에서 별도로 접근제한자(private,default, protected, public)를 주지 않으면
 *    default 접근 권한을 갖게 된다.
 * 	  private 동일 클래스 내에서 접근 가능
 *    default 접근 권한은 동일 패키지 내에서는 접근 가능
 *	  protected 동일 패키지, 상속 받은 클래스 내에서 접근 가능
 *    public 어디서나 접근 가능
 * */

/* <패키지 설계 방법>
 * 1) 회사 이름을 기준으로 만드는 경우가 종종 있다.
 *    예를 들어, www.bitcamp.co.kr을 도메인으로 가지는 회사는 
 *    패키지를 설계할 때
 *    kr.co.bitcamp로 만드는 경우가 종종있다.
 * 2) 최상위 패키지는 <회사의 도메인> - unique(유일성)
 * 3) 중간 패키지는 <모듈 이름/역할>
 * 4) 가장 아래 패키지는 패키지 내에 있는 클래스의 역할
 * */

/* 접근권한
 * public (공공의) : 어디서나 마음대로 접근 호출 가능 
 * protected (보호하는) : 패키지가 동일,
 * 						다른 패키지라도 상속이면 접근 호출 가능
 * default : 동일한 패키지만 접근 호출 가능 
 * private (개인적인) : 클래스 내에서만 접근 호출 가능
 * */

public class CircleMain {
	public static void main(String[] args) {
		// 같은 패키지에 있는 Circle 객체 생성
		Circle cc = new Circle(2);
		System.out.println(cc.circleArea());

		// 다른 패키지에 있는 Triangle 객체 생성 -> 패키지.클래스 import 시켜줘야함
		Triangle ta = new Triangle(2, 3);
		System.out.println(ta.getTriangleArea());

		// 패키지.클래스 import 하지 않고 사용하려는 경우
		// import javaLec._class.ex08Package.Circle;
		// 패키지.클래스 써준 채로 객체 생성
		javaLec._class.ex08Package.Circle circle = new javaLec._class.ex08Package.Circle(3);
		System.out.println(circle.circlePerimeter());
	}
}
