package exercise_190325;
//1. 클래스를 정의한다

//클래스 이름은 PhoneInfo이다
//이 클래스에는 다음의 데이터들이 문자열로 저장가능해야 한다
//이름		name		String
//전화번호	phoneNumber	String
//생년월일	birthday	String
//
//저장된 데이터의 출력 메서드도 정의한다
//생년월일 정보를 저장하는 생성자
//저장하지 않는 생성자를 정의한다
//
//main에서 2개의 PhoneInfo객체를 생성하고 출력해보도록 구현한다

class PhoneInfo {
	private String name;
	private String phoneNumber;
	private String birthday;

	// 저장하지 않는 생성자를 정의한다
	PhoneInfo() {

	}

	// 생년월일 정보를 저장하는 생성자
	PhoneInfo(String birthday) {
		this.birthday = birthday;
	}

	// 저장된 데이터의 출력 메서드도 정의한다
	public void printInfo() {
		System.out.println(String.format("이름 : %s \n전화번호 : %s\n생년월일 : %s\n", name, phoneNumber, birthday));
	}

}

public class Basic_01 {
	public static void main(String[] args) {
		PhoneInfo phoneInfo1 = new PhoneInfo();
		PhoneInfo phoneInfo2 = new PhoneInfo("950114");
		
		phoneInfo1.printInfo();
		phoneInfo2.printInfo();
	}
}
