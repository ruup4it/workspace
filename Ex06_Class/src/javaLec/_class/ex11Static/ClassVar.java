package javaLec._class.ex11Static;
/* static 변수는 객체 생성 이전에 메모리에 올라가고
 * 모든 객체에서 공유할 수 있다.
 * */
/* 인스턴스 변수는 객체가 생성될 때 함께 생성되며, 객체 별로 별도이다. (모든 객체에서 공유할 수 없음)
 * */

/* static은 클래스 소속이고 이멤버는 객체에서 자유롭게 접근 가능하지만 클래스의 딱 1개만 존재할 수 있다.
 * 그러므로 객체별로 다른 정보가 아니라 공통된 정보를 메서드를 
 * static으로 만들면 공통적으로 사용할 수 있다.
 * 
 * */
/* static 멤버 : 객체 생성 전에 메모리에 로딩, 클래스에 1개만 존재
 * instance 멤버 : 객체 생성 시 메모리에 로딩, 객체 갯수 만큼 존재
 * */
class InstCnt {
	//static int instNum;
	int instNum;
	InstCnt(){
		instNum++;
		System.out.println(String.format("인스턴스 생성 : %d",instNum));
	}
}

public class ClassVar {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		InstCnt ic1 = new InstCnt();
		@SuppressWarnings("unused")
		InstCnt ic2 = new InstCnt();
		@SuppressWarnings("unused")
		InstCnt ic3 = new InstCnt();
	}
}
