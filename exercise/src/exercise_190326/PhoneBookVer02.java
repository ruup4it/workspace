package exercise_190326;

import java.util.Arrays;

/*
 * 전화번호 관리 프로그램 구현 프로젝트
 * Version 0.2
 */

import java.util.Scanner;

class PhoneInfo // 주소록 구조
{
	String name;
	String phoneNumber;
	String birth;

	public PhoneInfo(String name, String num, String birth) {
		this.name = name;
		phoneNumber = num;
		this.birth = birth;
		System.out.println("데이터 입력이 완료되었습니다.");
	}

	public PhoneInfo(String name, String num) {
		this.name = name;
		phoneNumber = num;
		this.birth = null;
		System.out.println("데이터 입력이 완료되었습니다.");
	}

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
		if (birth != null)
			System.out.println("birth: " + birth);

		System.out.println(""); // 데이터 구분을 위해
	}
}

public class PhoneBookVer02 {
	static Scanner keyboard = new Scanner(System.in);
	static PhoneInfo[] phoneList = new PhoneInfo[3];

	public static void showMenu() // 메뉴 출력
	{
		System.out.println("--선택하세요--");
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
				System.out.println("저장 공간이 부족합니다.");
				break;
			} else if (phoneList[j] == null) {
				System.out.print("이름: ");
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
		System.out.println("==================");
		System.out.println("데이터 검색");
		int[] findData = new int[3]; // 찾은 값을 담아주는 List
		for (int j = 0; j < findData.length; j++) {
			findData[j] =-1;
		}
		//System.out.println(Arrays.toString(findData));
		System.out.println("검색하실 데이터를 입력하세요");
		System.out.println("입력 :");
		keyboard.nextLine();
		String keyword = keyboard.nextLine();
		int count = 0;
		
		for (int i = 0; i < phoneList.length; i++) {
			if (keyword.equals(phoneList[i].name) || keyword.equals(phoneList[i].phoneNumber)
					|| keyword.equals(phoneList[i].birth)) {
				for (int j = 0; j < findData.length; j++) {
					if (findData[j] == -1) {
						findData[j] = i;
						count++;
						break;
					}
				}
			}
		}

		if (count == 0) {
			System.out.println("조회된 결과가 없습니다.");
		} else {
			for (int i = 0; i < phoneList.length; i++) {
				System.out.println(String.format("========== %d ==========", i + 1));
				System.out.println(String.format("이름 : %s", phoneList[findData[i]].name));
				System.out.println(String.format("전화번호 : %s", phoneList[findData[i]].phoneNumber));
				System.out.println(String.format("주소 : %s", phoneList[findData[i]].birth));
				System.out.println(String.format("======================="));
			}
		}
	}

	public static void readData() { // 데이터 전체 조회
		System.out.println("==================");
		System.out.println("데이터 전체 조회하기");
		System.out.println(Arrays.toString(phoneList));
//		for (int i = 0; i < phoneList.length; i++) {
//			if (phoneList[i].name != null) {
//				phoneList[i].showPhoneInfo();
//			} else {
//				break;
//			}
//		}
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
				break;

			case 4: // 데이터 전체 조회
				readData();
				break;
			case 5: // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
