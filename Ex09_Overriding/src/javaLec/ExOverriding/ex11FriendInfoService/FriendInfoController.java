package javaLec.ExOverriding.ex11FriendInfoService;

import java.util.Scanner;

public class FriendInfoController {
	private Friend[] myFriends; // 친구 객체 저장 배열
	private int numOfFriends; // 저장된 친구수

	FriendInfoController(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	
	// 배열에 친구저장하고, 친구수 증가
	void addFriendInfo(Friend fren) {
		myFriends[numOfFriends++] = fren;
	}

	// 어떤 친구저장할래?
	void addFriend(int choice) {
		String name, phoneNum, addr, job, major;

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화 : ");
		phoneNum = sc.nextLine();
		System.out.print("주소 : ");
		addr = sc.nextLine();

		if (choice == 1) { // 고등학교 친구니?
			System.out.print("직업 : ");
			job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		} else if (choice == 2) { // 대학 친구니?
			System.out.print("학과 : ");
			major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("--- 입력 완료 ! ---\n");
	}

	void showAllData() {
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showData();
			System.out.println();
		}
	}

	void showAllsimpleData() {
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showBasicInfo();
			System.out.println();
		}
	}
}
