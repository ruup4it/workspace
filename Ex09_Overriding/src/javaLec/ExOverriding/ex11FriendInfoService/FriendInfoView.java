package javaLec.ExOverriding.ex11FriendInfoService;

import java.util.Scanner;

class Menu {
	final static int HIGH_FRIEND = 1;
	final static int UNIV_FRIEND = 2;
	final static int SHOW_ALL = 3;
	final static int SHOW_SIMPLE = 4;
	final static int EXIT_PROGRAM = 5;
}

public class FriendInfoView {
	FriendInfoController controller;

	FriendInfoView() {
		controller = new FriendInfoController(getFriendNum());
	}

	int getFriendNum() {
		System.out.print("몇 명 친구 저장하실래요?");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		return num;
	}

	void viewMenu() {
		System.out.println("*** 메뉴 선택 ***");
		System.out.println(Menu.HIGH_FRIEND + ". 고교 정보 저장");
		System.out.println(Menu.UNIV_FRIEND + ". 대학 친구 저장");
		System.out.println(Menu.SHOW_ALL + ". 전체 정보 출력");
		System.out.println(Menu.SHOW_SIMPLE + ". 기본 정보 출력");
		System.out.println(Menu.EXIT_PROGRAM + ". 프로그램 종료");
	}

	int getUserSelect() {
		System.out.print("선택 >> ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		return choice;
	}

	boolean runChoice(int choice) {
		switch (choice) {
		case Menu.HIGH_FRIEND:
		case Menu.UNIV_FRIEND:
			controller.addFriend(choice);
			break;
		case Menu.SHOW_ALL:
			controller.showAllData();
			break;
		case Menu.SHOW_SIMPLE:
			controller.showAllsimpleData();
			break;
		case Menu.EXIT_PROGRAM:
			System.out.println("이용해주셔서 감사합니다.");
			return false;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		return true;
	}

	void menuLoop() {
		while (true) {
			viewMenu();
			int choice = getUserSelect();
			boolean isRun = runChoice(choice);
			if (isRun == false)
				break;
		}
	}
}
