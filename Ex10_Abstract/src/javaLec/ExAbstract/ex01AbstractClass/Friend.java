package javaLec.ExAbstract.ex01AbstractClass;

// 추상메서드가 1개이상 있으면 추상 클래스
/* 구현안된 메서드가 있으므로 객체 생성이 안됨
 * 무조건 상속을 전제로 만들어진 클래스
 * 1) 자식 클래스는 추상 메서드를 무조건 구현해야 객체 생성이 됨
 * 2) 추상클래스는 참조변수를 제공하고, 자식 클래스는 객체를 담는다*/
public abstract class Friend {
	String name;
	String phoneNum;
	String addr;
	
	Friend(){
		name = "친구";
		phoneNum = "000-000-000";
		addr = "동네";
	}
	Friend(String name, String phone, String addr){
		this.name = name;
		this.phoneNum = phone;
		this.addr = addr;
	}
	void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
		System.out.println("주소 : " + addr);
	}
	abstract void showBasicInfo();	// 추상 메서드
}










