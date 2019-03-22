package javaLec._class.ex11Static;

class AccessWay {
	static int num = 0;

	AccessWay() {
		incrCnt();
	}

	/*
	 * static 변수는 static 메서드나 instance메서드 관계없이 클래스 내부에서 자유롭게 접근 가능하다.
	 */
	public void incrCnt() {
		num++;
	}
}
/* static 멤버의 접근
 * 1) 클래스 내부에서 자유롭게 접근
 * 2) 클래스 이름으로 접근
 * 3) 객체 이름으로 접근
 * 선호하는 방식 : 클래스 이름 > 객체 이름 
 * static은 객체 별로 생성되는 변수가 아니고
 * 클래스에 유일하게 공유할 수 있는 변수이므로
 * 클래스 소속으로 호출하는 것이 더 명확
 * */
public class ClassVarAccess {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		AccessWay way = new AccessWay();
		AccessWay.num++; 	// 클래스명으로 접근
		way.num++; 			// 객체로 접근
		System.out.println(String.format("num = %d",AccessWay.num));

	}
}
