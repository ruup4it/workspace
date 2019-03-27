package javaLec.ExOverriding.ex11FriendInfoService;

public class UnivFriend extends Friend {
	String major;		// 전공학과

	UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	void showData() {
		super.showData();
		System.out.println("전공 : " + major);
	}
	void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
		System.out.println("전공 : " + major);
	}
}








