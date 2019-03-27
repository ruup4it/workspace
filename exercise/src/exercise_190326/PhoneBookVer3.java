package exercise_190326;



/*
 * 전화번호 관리 프로그램 구현 프로젝트
 * Version 0.2
 */

import java.util.Scanner;

class PhoneInfo // 주소록 구조
{
	String name; // 이름
	String phoneNumber; // 전화번호
	String birth; // 생년월일

	// 생성자
	public PhoneInfo(String name, String num, String birth) {
		this.name = name;
		phoneNumber = num;
		this.birth = birth;
		System.out.println("\n데이터 입력이 완료되었습니다.\n");
	}

	// 생성자
	public PhoneInfo(String name, String num) {
		this.name = name;
		phoneNumber = num;
		this.birth = null;
		System.out.println("\n데이터 입력이 완료되었습니다.\n");
	}

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
		if (birth != null)
			System.out.println("birth: " + birth);

		System.out.println(); // 데이터 구분을 위해
	}
}

public class PhoneBookVer3 {
	static Scanner keyboard = new Scanner(System.in);
	static PhoneInfo[] phoneList = new PhoneInfo[3];

	public static void showMenu() // 메뉴 출력
	{
		System.out.println("=========메뉴=========");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 데이터 전체 조회");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택: ");
	}

	public static void createData() // 1. 데이터 입력
	{
		for (int j = 0; j < phoneList.length; j++) {

			if (phoneList[phoneList.length - 1] != null) {
				System.out.println("=====================");
				System.out.println("\n저장 공간이 부족합니다.\n");
				break;
			} else if (phoneList[j] == null) {
				System.out.println("=====================");
				System.out.println("<데이터 입력하기>");
				System.out.print("\n이름: ");
				String name = keyboard.nextLine();
				System.out.print("전화번호: ");
				String phone = keyboard.nextLine();
				System.out.print("생년월일: ");
				String birth = keyboard.nextLine();

				PhoneInfo info = new PhoneInfo(name, phone, birth);
				phoneList[j] = info;
				break;
			}

		}

	}

	public static void searchData() {
		System.out.println("=====================");
		System.out.println("<데이터 검색하기>");
		int[] findData = new int[3]; // 찾은 값을 담아주는 List
		for (int j = 0; j < findData.length; j++) {
			findData[j] = -1;
		}
		
		System.out.println("검색하실 데이터를 입력하세요");
		System.out.print("입력 :");
		String keyword = keyboard.nextLine();
		int count = 0;

		for (int i = 0; i < phoneList.length; i++) {
			if (phoneList[i] != null) {
				if ((keyword.equals(phoneList[i].name)) || (keyword.equals(phoneList[i].phoneNumber))
						|| (keyword.equals(phoneList[i].birth))) {
					for (int j = 0; j < findData.length; j++) {
						if (findData[j] == -1) {
							findData[j] = i;
							count++;
							break;
						}
					}
				}
			}
		}

		if (count == 0) {
			System.out.println("\n조회된 결과가 없습니다.\n");
		} else {
			System.out.println("\n" + count + "건의 검색 결과가 있습니다.\n");
			for (int i = 0; i < findData.length; i++) {
				if (findData[i] != -1) {
					System.out.println("[" + (i + 1) + "]");
					phoneList[findData[i]].showPhoneInfo();
				}
			}
		}
	}

	public static void deleteData() {
		System.out.println("=====================");
		System.out.println("<데이터 삭제하기>");
		int[] findData = new int[3]; // 찾은 값을 담아주는 List
		for (int j = 0; j < findData.length; j++) {
			findData[j] = -1;
		}
		System.out.println("삭제하실 데이터를 입력하세요");
		System.out.print("입력 :");
		String keyword = keyboard.nextLine();
		int count = 0;

		for (int i = 0; i < phoneList.length; i++) {
			if (phoneList[i] != null) {
				if ((keyword.equals(phoneList[i].name)) || (keyword.equals(phoneList[i].phoneNumber))
						|| (keyword.equals(phoneList[i].birth))) {
					for (int j = 0; j < findData.length; j++) {
						if (findData[j] == -1) {
							findData[j] = i;
							count++;
							break;
						}
					}
				}
			}
		}

		if (count == 0) {
			System.out.println("\n조회된 결과가 없습니다.\n");
		} else {
			System.out.println("\n" + count + "건의 결과가 있습니다.\n");
			for (int i = 0; i < findData.length; i++) {
				if (findData[i] != -1) {
					System.out.println("[" + (i + 1) + "]");
					phoneList[findData[i]].showPhoneInfo();
				}
			}

			System.out.println("삭제하실 데이터의 번호를 입력해주세요.");
			System.out.print("입력 : ");
			int select = keyboard.nextInt();
			
			for (int i = findData[select - 1]; i < phoneList.length - 1; i++) {
				phoneList[i] = phoneList[i + 1];
			}
			phoneList[phoneList.length - 1] = null;
			System.out.println("\n데이터가 삭제되었습니다\n");
		}

	}

	public static void readData() { // 데이터 전체 조회
		System.out.println("=====================");
		System.out.println("<데이터 전체 조회하기>");

		for (int i = 0; i < phoneList.length; i++) {
			if (phoneList[i] != null) {
				System.out.println("[" + (i + 1) + "]");
				phoneList[i].showPhoneInfo();
			}
		}
	}

	public static void main(String[] args) {
		int choice;

		while (true) {
			showMenu();
			choice = keyboard.nextInt();
			keyboard.nextLine();

			switch (choice) {
			case 1: // 데이터 입력
				createData();
				break;
			case 2: // 데이터 검색
				searchData();
				break;

			case 3: // 데이터 삭제
				deleteData();
				break;

			case 4: // 데이터 전체 조회
				readData();
				break;
			case 5: // 프로그램 종료
				System.out.println("\n이용해주셔서 감사합니다.\n");
				return;
			default:
				System.out.println("\n잘못 입력하셨습니다.\n");
				break;
			}
		}
	}
}
