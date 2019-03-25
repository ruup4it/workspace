package exercise_190325;
//1. Basic의 PhoneInfo클래스를 정의한다

import java.util.ArrayList;
import java.util.Scanner;

//새로운 클래스 PhoneBookManager를 정의한다
//class PhoneBookManager{
//	public static void showMenu();		// 메뉴출력
//	public static void readData();		// PhoneInfo객체에 데이터 저장
//	public static void main(String[] args); // 메뉴선택 반복 루프
//}
//
//구현하세요
//
//실행하면 이렇게 나타납니다
//
//
//--선택하세요--
//1. 데이터 입력
//2. 프로그램 종료
//선택 : 1
//이름: 홍길동
//전화번호 : 222-3333
//생년월일 : 99년 12월 25일생
//
//<입력된 정보 출력>
//name : 홍길동
//phone : 222-3333
//birth : 99년 12월 25일생
//
//--선택하세요--
//1. 데이터 입력
//2. 프로그램 종료
//선택 :

class PhoneInfo {
	private String name;
	private String phoneNumber;
	private String birthday;

	// 저장하지 않는 생성자를 정의한다
	PhoneInfo() {}

	// 생년월일 정보를 저장하는 생성자
	PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	// 저장된 데이터의 출력 메서드도 정의한다
	public void printInfo() {
		System.out.println(String.format(
						"\n<입력된 정보 출력>\n"
						+ "name : %s \n"
						+ "phone : %s\n"
						+ "birth : %s\n",
						name, phoneNumber, birthday));
	}

}

public class PhoneBookManager {
	static ArrayList<PhoneInfo> phoneList = new ArrayList<PhoneInfo>();

	public static void showMenu() {// 메뉴출력
		System.out.println("--선택하세요--");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 : ");
	}

	public static void readData(Scanner scan) { // PhoneInfo객체에 데이터 저장
		scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = scan.nextLine();
		System.out.print("생년월일 : ");
		String birthday = scan.nextLine();
		
		//birthday = birthday.substring(0, 2) + "년 " + birthday.substring(2, 4) + "월 " + birthday.substring(4, 6) + "일";
		PhoneInfo phoneInfo = new PhoneInfo(name, phoneNumber, birthday);
		phoneInfo.printInfo();
		
		phoneList.add(phoneInfo);
	}
	
	public static void selectData() {
		for(int i =0 ; i<phoneList.size();i++) {
			phoneList.get(i).printInfo();
		}
	}
	
	public static void main(String[] args) { // 메뉴선택 반복 루프
		Scanner scan = new Scanner(System.in);
		while (true) {
			showMenu();
			int input = scan.nextInt();
			switch (input) {
			case 1:
				readData(scan);
				break;
			case 2:
				System.out.println("이용해주셔서 감사합니다.");
				scan.close();
				System.exit(0);
				break;
			case 3 :
				selectData();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}
}