package javaLec.ExAbstract.ex01AbstractClass;

public class FriendMain {
	public static void main(String[] args) {
		HighFriend hf = new HighFriend();
		UnivFriend uf = new UnivFriend();
		//Friend f = new Friend(); // 추상클래스는 객체 생성 안됨
		Friend[] fArray = new Friend[] {hf, uf};
		for(Friend f : fArray)
			f.showBasicInfo();
		
		System.out.println("실행 끝");
	}
}
