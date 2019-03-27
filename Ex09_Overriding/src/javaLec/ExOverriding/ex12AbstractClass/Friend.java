package javaLec.ExOverriding.ex12AbstractClass;
// 추상 메서드가 1개 이상 있으면 추상클래스
/* 구현되지 않은 메서드가 있으므로 객체 생성이 안 됨
 * 무조건 상속을 전제로 만들어진 클래스
 * */
public abstract class Friend {
	String name;
	String phoneNum;
	String addr;
	
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
	abstract void showBasicInfo(); // 추상메서드
}










