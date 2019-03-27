package javaLec.ExOverriding.ex11FriendInfoService;

public class HighFriend extends Friend {
	String work;

	HighFriend(String name, String phone, String addr, String job) {
		super(name, phone, addr);
		this.work = job;
	}
	void showData() {
		super.showData();
		System.out.println("직업 : " + work);
	}
	void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
	}
}




