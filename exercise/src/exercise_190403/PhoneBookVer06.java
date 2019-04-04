package exercise_190403;
/*
 * 전화번호 관리 프로그램 구현 프로젝트
 * Version 0.6
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

interface INIT_MENU {
	int INPUT = 1, SEARCH = 2, DELETE = 3, EXIT = 4;
}

interface INPUT_SELECT {
	int NORMAL = 1, UNIV = 2, COMPANY = 3;
}

class MenuChoiceException extends Exception {
	int wrongChoice;

	public MenuChoiceException(int choice) {
		super("잘못된 선택이 이뤄졌습니다.");
		wrongChoice = choice;
	}

	public void showWrongChoice() {
		System.out.println(wrongChoice + "에 해당하는 선택은 존재하지 않습니다.");
	}
}

class PhoneInfo {
	String name;
	String phoneNumber;

	public PhoneInfo(String name, String num) {
		this.name = name;
		phoneNumber = num;
	}

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
	}

	public boolean equals(Object obj) {
		PhoneInfo phoneInfo = (PhoneInfo) obj;
		if (phoneInfo.name == name)
			return true;
		else
			return false;
	}
}

class PhoneUnivInfo extends PhoneInfo {
	String major;
	int year;

	public PhoneUnivInfo(String name, String num, String major, int year) {
		super(name, num);
		this.major = major;
		this.year = year;
	}

	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major: " + major);
		System.out.println("year: " + year);
	}
}

class PhoneCompanyInfo extends PhoneInfo {
	String company;

	public PhoneCompanyInfo(String name, String num, String company) {
		super(name, num);
		this.company = company;
	}

	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company: " + company);
	}
}

class PhoneBookManager {
	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();


	static PhoneBookManager inst = null;

	public static PhoneBookManager createManagerInst() {
		if (inst == null)
			inst = new PhoneBookManager();

		return inst;
	}

	private PhoneBookManager() {
	}

	private PhoneInfo readFriendInfo() {
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호: ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}

	private PhoneInfo readUnivFriendInfo() {
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호: ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("전공: ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.print("학년: ");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}

	private PhoneInfo readCompanyFriendInfo() {
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호: ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("회사: ");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}

	public void inputData() throws MenuChoiceException {
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> ");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info = null;

		if (choice < INPUT_SELECT.NORMAL || choice > INPUT_SELECT.COMPANY)
			throw new MenuChoiceException(choice);

		switch (choice) {
		case INPUT_SELECT.NORMAL:
			info = readFriendInfo();
			break;
		case INPUT_SELECT.UNIV:
			info = readUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY:
			info = readCompanyFriendInfo();
			break;
		}

		infoStorage.add(info);
		System.out.println("데이터 입력이 완료되었습니다. \n");
	}

	public void searchData() {
		System.out.println("데이터 검색을 시작합니다..");

		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();

		PhoneInfo dataIdx = search(name);

		if (dataIdx == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			dataIdx.showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}

	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다..");

		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();

		PhoneInfo dataIdx = search(name);
		if (dataIdx == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			infoStorage.remove(dataIdx);
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
	}

	private PhoneInfo search(String name) {
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while (itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if (curInfo.name.equals(name)) {
				return curInfo;
			}
		}
		return null;
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

public class PhoneBookVer06 {
	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		int choice;

		while (true) {
			try {
				MenuViewer.showMenu();
				choice = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();

				if (choice < INIT_MENU.INPUT || choice > INIT_MENU.EXIT)
					throw new MenuChoiceException(choice);

				switch (choice) {
				case INIT_MENU.INPUT:
					manager.inputData();
					break;
				case INIT_MENU.SEARCH:
					manager.searchData();
					break;
				case INIT_MENU.DELETE:
					manager.deleteData();
					break;
				case INIT_MENU.EXIT:
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.\n");
			}
		}
	}
}