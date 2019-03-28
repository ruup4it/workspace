package javaLec.ExInterface.ex01_APersonalNumberStorage;

// ΅ΐΜΕΝ °΄ΓΌ
public class PersonalNumInfo {
	private String name; // 멤버 변수 : 이름
	private String number; // 멤버 변수 : 번호

	// 생성자
	PersonalNumInfo(String name, String number) {
		this.name = name;
		this.number = number;
	}

	// get메소드 - 이름
	String getName() {
		return name;
	}

	// get메소드 - 번호
	String getNumber() {
		return number;
	}
}
