﻿package javaLec.ExOverriding.ex11FriendInfoService;

public class Friend {
	String name;
	String phoneNum;
	String addr;
	
	Friend(String name, String phone, String addr){
		this.name = name;
		this.phoneNum = phone;
		this.addr = addr;
	}
	void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
		System.out.println("주소 : " + addr);
	}
	void showBasicInfo() {}
}










