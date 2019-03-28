/*
 * 전화번호 관리 프로그램 구현 프로젝트
 * Version 0.3
 */

/*
 * 2. PhoneBookVer03.java를 구현하세요
  PhoneInfo클래스를 상속받은
  PhoneUnivInfo클래스(대학친구들의 전화번호 저장)
  PhoneCompanyInfo클래스(회사동료들의 전화번호 저장)
  를 추가하세요
  <PhoneUnivInfo>
   이름 String name
   전화 String phoneNumber
   전공 String major
   학년 int year

  <PhoneCompanyInfo>
   이름 String name
   전화 String phoneNumber
   회사 String company

  저장하는 클래스가 추가되었다고 해서 
  추가로 배열을 선언해서는 안됩니다
  PhoneBookManager클래스의 
  searchData메서드도 수정해서는 안됩니다
  deleteData메서드도 수정해서는 안됩니다
  inputData메서드는 변경하면 됩니다.
   

실행하면 이렇게 나타납니다


--선택하세요--
1. 데이터 입력
2. 데이터 검색
3. 데이터 삭제
4. 프로그램 종료
선택 : 1
데이터 입력을 시작합니다..
1. 일반, 2. 대학, 3.회사
선택 : 1
이름: 홍길동
전화번호 : 222-3333
생년월일 : 99년 12월 25일생
데이터 입력이 완료되었습니다.

--선택하세요--
1. 데이터 입력
2. 데이터 검색
3. 데이터 삭제
4. 프로그램 종료
선택 :

 */
package exercise_190327;

import java.util.Scanner;

class PhoneInfo {
	String name;
	String phoneNumber;
	String birth;

	public PhoneInfo(String name, String num, String birth) {
		this.name = name;
		phoneNumber = num;
		this.birth = birth;
	}

	public PhoneInfo(String name, String num) {
		this.name = name;
		phoneNumber = num;
		this.birth = null;
	}

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
		if (birth != null)
			System.out.println("birth: " + birth);
	}
}

class PhoneUnivInfo extends PhoneInfo {
	String major; // 전공
	int year; // 학년

	public PhoneUnivInfo(String name, String num, String major, int year) {
		super(name, num);
		this.major = major;
		this.year = year;
	}

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	}
}

class PhoneCompanyInfo extends PhoneInfo {
	String company; // 회사

	public PhoneCompanyInfo(String name, String num, String company) {
		super(name, num);
		this.company = company;
	}

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
		System.out.println("company: " + company);
	}

}

class PhoneBookManager {
	final int MAX_CNT = 100;
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	int curCnt = 0;

	public void inputData() {
		// 1. 일반, 2. 대학, 3.회사
		String name, phone, birth, major, company;
		int year;
		
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3.회사");
		System.out.print("선택 : ");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		
		System.out.print("이름: ");
		name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호: ");
		phone = MenuViewer.keyboard.nextLine();

		if (choice == 1) { // 1. 일반
			System.out.print("생년월일 : ");
			birth = MenuViewer.keyboard.nextLine();
			infoStorage[curCnt++] = new PhoneInfo(name, phone, birth);
		} else if (choice == 2) { // 2. 대학
			System.out.print("전공 : ");
			major = MenuViewer.keyboard.nextLine();
			System.out.print("학년 : ");
			year = MenuViewer.keyboard.nextInt();
			infoStorage[curCnt++] = new PhoneUnivInfo(name, phone, major, year);

		} else if (choice == 3) { // 3. 회사
			System.out.print("회사 : ");
			company = MenuViewer.keyboard.nextLine();
			infoStorage[curCnt++] = new PhoneCompanyInfo(name, phone, company);
		}

		System.out.println("데이터 입력이 완료되었습니다. \n");
	}

	public void searchData() // 수정 불가
	{
		System.out.println("데이터 검색을 시작합니다..");

		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();

		int dataIdx = search(name);
		if (dataIdx < 0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}

	public void deleteData() // 수정 불가
	{
		System.out.println("데이터 삭제를 시작합니다..");

		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();

		int dataIdx = search(name);
		if (dataIdx < 0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			for (int idx = dataIdx; idx < (curCnt - 1); idx++)
				infoStorage[idx] = infoStorage[idx + 1];

			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
	}

	private int search(String name) { // 수정불가
		for (int idx = 0; idx < curCnt; idx++) {
			PhoneInfo curInfo = infoStorage[idx];
			if (name.compareTo(curInfo.name) == 0)
				return idx;
		}
		return -1;
	}
}

class MenuViewer {
	public static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택: ");
	}
}

class PhoneBookVer03 {
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		int choice;

		while (true) {
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();

			switch (choice) {
			case 1:
				manager.inputData();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.deleteData();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}